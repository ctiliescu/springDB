package com.db.store.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping
    void createUser(@RequestBody User user) {
        System.out.println(user.getFirstName());
    }
}
