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

@Path("/api/v1/usuarios/autos")
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
    @GET
    public List<Auto> getAllAutos() {
        this.logger.info("Retorno de todos los vehiculos");
        return this.autoRepository.getAll();
    }




    //Agregar un nuevo auto
    @POST
    public Response create(Auto auto) {
        this.logger.info("Agregar un vehiculo a la flota");
        try {
            Auto persistentCar = this.autoRepository.save(auto);
            return Response.status(Status.CREATED).entity(persistentCar).build();
        } catch (Exception var4) {
            return Response.serverError().entity(var4.getMessage()).build();
        }
    }


    //Llamar un auto por chapa
    //mirar UUID y ID
    @GET
    @Path("{chapa}")
    public Optional<Auto> getAuto(@PathParam("chapa") UUID chapa) {
        this.logger.info("Retorno del vehiculo con chapa " + chapa);
        return this.autoRepository.getById(chapa);
    }




    //Agregar un auto por chapa
    @PUT
    @Path("{chapa}")
    public Response update(@PathParam("id") UUID chapa, Auto auto) throws Exception {
        Auto persistentCar = this.autoRepository.update(chapa, auto);
        return Response.status(Status.CREATED).entity(persistentCar).build();
    }



    //Borrar auto
    //mirar UUID y ID
    @DELETE
    @Path("{chapa}")
    public Response delete(@PathParam("chapa") UUID chapa) throws Exception {
        this.logger.info("El vehiculo fue eliminado" + chapa);
        this.autoRepository.delete(chapa);
        return Response.noContent().build();
    }
}
