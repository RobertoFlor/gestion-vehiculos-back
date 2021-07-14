//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.resource;

import com.datapar.model.Usuario;
import com.datapar.repository.UsuarioRepository;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Path("/api/v1/usuarios")
@Consumes({"application/json"})
@Produces({"application/json"})
public class UsuarioResource {
    @Inject
    UsuarioRepository usuarioRepository;
    @Inject
    Logger logger;

    public UsuarioResource() {
    }

    @GET
    public List<Usuario> getAllUsuarios() {
        this.logger.info("Retorno todo los usuarios");
        return this.usuarioRepository.getAll();
    }

    @POST
    public Response create(Usuario usuario) {
        try {
            this.logger.info("Creacion de usuario");

            try {
                Usuario persistentUser = this.usuarioRepository.save(usuario);
                return Response.status(Status.CREATED).entity(persistentUser).build();
            } catch (Exception var4) {
                return Response.serverError().entity(var4.getMessage()).build();
            }
        } catch (Throwable var5) {
            throw var5;
        }
    }

    @GET
    @Path("{id}")
    public Optional<Usuario> getUsuario(@PathParam("id") UUID id) {
        this.logger.info("Retorno el usuario con id " + id);
        return this.usuarioRepository.getById(id);
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") UUID id, Usuario usuario) throws Exception {
        try {
            Usuario persistentUser = this.usuarioRepository.update(id, usuario);
            return Response.status(Status.CREATED).entity(persistentUser).build();
        } catch (Throwable var4) {
            throw var4;
        }
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") UUID id) throws Exception {
        try {
            this.logger.info("Removendo Usuario" + id);
            this.usuarioRepository.delete(id);
            return Response.noContent().build();
        } catch (Throwable var3) {
            throw var3;
        }
    }
}
