package com.mobile.academy.users;

import com.mobile.academy.users.user.model.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<String> handlerForUserNotFoundException(UserNotFoundException e) {
        return new ResponseEntity<>("handlerForUserNotFoundException", HttpStatus.NOT_FOUND);
    }
}
