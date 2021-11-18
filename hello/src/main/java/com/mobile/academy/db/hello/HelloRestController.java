package com.mobile.academy.db.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("api/v1")
public class HelloRestController {
    @Autowired
    private HelloService helloService;

    public HelloRestController() {
        System.out.println(" ------> Create HelloRestController");
    }

    @Autowired
    private ApplicationContext appContext;

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
        String result = helloService.helloMessage(objectResponse);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
