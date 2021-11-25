package com.db.store.users;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("store/v1/api/users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    UserEntity createUser(@RequestBody User user) {
        UserEntity userEntity = userService.createUser(user);
        log.info("saved user: {}", user.getEmail());
        return userEntity;
    }

    @GetMapping
    UserEntity getUserByEmail(@RequestParam String email){
        log.info("search for user: " + email);
        return userService.getUserByEmail(email);
    }
}
