package com.db.store.config;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import com.db.store.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException userNotFoundException) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({InvalidPaymentDetailsException.class})
    public ResponseEntity<?> InvalidPaymentDetailsException(InvalidPaymentDetailsException invalidPaymentDetailsException) {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
