package com.mobile.academy.users.user;

import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.service.UsersService;
import com.mobile.academy.users.user.service.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    private void insertUser(@RequestBody CreateUserRequest createUserRequest) {
        usersService.createNewUser(createUserRequest);
    }

    @GetMapping("/users")
    private ResponseEntity<List<UserDao>> getAllUsers() {
        return ResponseEntity.ok(usersService.getAllUsers());
    }
}
