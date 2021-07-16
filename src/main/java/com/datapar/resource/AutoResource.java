//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.resource;
import com.datapar.model.Auto;
import com.datapar.repository.AutoRepository;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Path("/api/v1/autos")
@Consumes({"application/json"})
@Produces({"application/json"})
public class AutoResource {


    @Inject
    AutoRepository autoRepository;
    @Inject
    Logger logger;

    public AutoResource() {
    }


    //Ver todos los autos
    //Metodo Get
    @GET
    public List<Auto> getAllAutos() {
        this.logger.info("Retorno de todos los vehiculos");
        return this.autoRepository.getAll();
    }


    //Agregar un nuevo auto
    @POST
    public Response create(Auto auto) {
        try {
            this.logger.info("Agregar un vehiculo a la flota");
            try {
                Auto persistentCar = this.autoRepository.save(auto);
                return Response.status(Status.CREATED).entity(persistentCar).build();
            } catch (Exception var4) {
                return Response.serverError().entity(var4.getMessage()).build();
            } catch (Throwable var5) {
                throw var5;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //Llamar un auto por chapa
    //mirar UUID y ID
    @GET
    @Path("{id}")
    public Optional<Auto> getAuto(@PathParam("id") UUID id) {
        this.logger.info("Retorno del vehiculo" + id);
        return this.autoRepository.getById(id);
    }


    //Agregar un auto
    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") UUID id, Auto auto) throws Exception {
        try {
            Auto persistentCar = this.autoRepository.update(id, auto);
            return Response.status(Status.CREATED).entity(persistentCar).build();
        } catch (Throwable var4) {
            throw var4;
        }
    }


    //Borrar auto
    //mirar UUID y ID
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") UUID id) throws Exception {
        try {
            this.logger.info("El vehiculo fue eliminado" + id);
            this.autoRepository.delete(id);
            return Response.noContent().build();
        }
        catch (Throwable var3){
            throw var3;
        }
    }
}