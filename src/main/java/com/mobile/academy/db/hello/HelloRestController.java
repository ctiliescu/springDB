package com.mobile.academy.db.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("api/v1")
public class HelloRestController {

    @GetMapping("/hello/{nameFromPath}")
    @ResponseStatus(HttpStatus.OK)
    ObjectResponse hello(HttpServletResponse response,
                         HttpServletRequest request,
                         @PathVariable String nameFromPath) {
        // add cookie to the response
        Cookie cookie = new Cookie("username", "test");
        response.addCookie(cookie);

        // set status code example to response
        // response.setStatus(309);
        return new ObjectResponse("hello", nameFromPath);
    }

    @PostMapping("/hello")
    public ResponseEntity<String> helloBack(@RequestBody ObjectResponse objectResponse,
                                            @RequestHeader(name = "customheader") String s,
                                            @RequestParam(name = "customparam") String p) {
        System.out.println(s);
        System.out.println(p);
        return new ResponseEntity<>("hello " +objectResponse.getMessage() + objectResponse.getName(), HttpStatus.CREATED);
    }
}
