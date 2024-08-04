package es.fercbrt.srpingbooterrorshandler.controller.exception;

import es.fercbrt.srpingbooterrorshandler.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;
import java.util.Map;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> handleArithmeticException(ArithmeticException e) {
        Error error = new Error("Operation not allowed", e.getMessage(), 400, new Date());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> handleNoHandlerFoundException(NoHandlerFoundException e) {
        Error error = new Error("Resource not found", e.getMessage(), 404, new Date());
        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Error> handleNumberFormatException(NumberFormatException e) {
        Error error = new Error("Invalid number format", e.getMessage(), 400, new Date());
        return ResponseEntity.badRequest().body(error);
    }
}
