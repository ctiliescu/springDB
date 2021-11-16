package com.mobile.academy.db.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/hello")
    public ObjectResponse helloWorld(){
        System.out.println("Hello World!");
        return new ObjectResponse("HelloWorld", "Ioan");
    }

}
