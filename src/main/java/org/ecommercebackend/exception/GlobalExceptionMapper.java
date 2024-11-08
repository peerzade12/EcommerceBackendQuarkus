package org.ecommercebackend.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.ecommercebackend.model.entity.ErrorMessage;

@Provider
public class GlobalExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        ErrorMessage error = new ErrorMessage();
        error.setMessage(exception.getMessage());
        error.setStatusCode(500);
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
    }
}
