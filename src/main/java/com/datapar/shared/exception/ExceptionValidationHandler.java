//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.shared.exception;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.stream.Collectors;

@Provider
public class ExceptionValidationHandler implements ExceptionMapper<ConstraintViolationException> {
    @Inject
    Logger logger;

    public ExceptionValidationHandler() {
    }

    public Response toResponse(ConstraintViolationException e) {
        this.logger.info("Handle ConstraintViolationException");
        Object error = e.getConstraintViolations().stream().map((p) -> {
            return p.getMessage();
        }).collect(Collectors.toList());
        return Response.status(Status.BAD_REQUEST).entity(error).build();
    }
}
