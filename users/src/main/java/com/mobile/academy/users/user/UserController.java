package com.mobile.academy.users.user;

import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    private void insertUser(@RequestBody CreateUserRequest createUserRequest) {
        usersService.createNewUser(createUserRequest);
    }
}
