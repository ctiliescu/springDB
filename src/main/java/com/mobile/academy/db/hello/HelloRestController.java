package com.mobile.academy.db.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloRestController {
    @GetMapping("/hello")
    public ObjectResponse helloWorld(){
        System.out.println("Hello World!");
        return new ObjectResponse("HelloWorld", "Ioan");
    }

    @PostMapping("/hello")
    public ResponseEntity<String> helloBack(@RequestBody ObjectResponse requestBody) {
        return new ResponseEntity<>("Hello " + requestBody.getMessage() + " " + requestBody.getName(), HttpStatus.CREATED);
    }
}
