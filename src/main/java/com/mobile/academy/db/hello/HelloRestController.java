package com.mobile.academy.db.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class HelloRestController {

    @GetMapping("/hello/{nameFromPath}")
    ObjectResponse hello(@PathVariable String nameFromPath) {
        System.out.println("hello!");
        return new ObjectResponse("hello", nameFromPath);

    }

    @PostMapping("/hello")
    public ResponseEntity<String> helloBack(@RequestBody ObjectResponse objectResponse, @RequestHeader(name = "customheader") String s,
                                            @RequestParam(name = "customparam") String p) {
        System.out.println(s);
        System.out.println(p);
        return new ResponseEntity<>("hello " +objectResponse.getMessage() + objectResponse.getName(), HttpStatus.CREATED);
    }
}
