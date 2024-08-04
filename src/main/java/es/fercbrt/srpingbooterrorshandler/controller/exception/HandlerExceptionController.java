package es.fercbrt.srpingbooterrorshandler.controller.exception;

import es.fercbrt.srpingbooterrorshandler.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> handleArithmeticException(ArithmeticException e) {
        Error error = new Error("Operation not allowed", e.getMessage(), 400, new Date());
        return ResponseEntity.badRequest().body(error);
    }
}
