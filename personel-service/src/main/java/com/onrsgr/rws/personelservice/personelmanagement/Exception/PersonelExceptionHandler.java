package com.onrsgr.rws.personelservice.personelmanagement.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class PersonelExceptionHandler {
    /*
    @ExceptionHandler(MissingHeaderInfoException.class)
    public final ResponseEntity<ErrorResponse> handleInvalidTraceIdException
            (MissingHeaderInfoException ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse(BAD_REQUEST, details);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    */
}
