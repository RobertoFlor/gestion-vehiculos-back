//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.shared.exception;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UsuarioExceptionValidationHandler implements ExceptionMapper<CustomException> {
    @Inject
    Logger logger;

    public UsuarioExceptionValidationHandler() {
    }

    public Response toResponse(CustomException e) {
        this.logger.info("Handle UsuarioValidationException");
        return Response.status(Status.BAD_REQUEST).entity(e.getLocalizedMessage()).build();
    }
}
