package com.mobile.academy.db.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public ResponseEntity<ObjectResponse> helloWorld(){
        System.out.println("Hello World!");
        return new ResponseEntity<>(new ObjectResponse("HelloWorld", "Ioan"), HttpStatus.CREATED);
    }

}
