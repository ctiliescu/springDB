package com.mobile.academy.users.user;

import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.model.UserNotFoundException;
import com.mobile.academy.users.user.service.UsersService;
import com.mobile.academy.users.user.service.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/user/search")
    private UserDao getUserByLastName(@RequestParam(name = "lastName") String lastName) throws UserNotFoundException {
//        UserDao userByLastName = usersService.getUserByLastName(lastName);
//        return ResponseEntity.ok(userByLastName);

//        Optional<UserDao> userByLastNamOp = usersService.getUserByLastNamOp(lastName);
//        if(userByLastNamOp.isPresent()) {
//            return userByLastNamOp.get();
//        }
//        throw new UserNotFoundException();

        return usersService.getUserByLastNamOp(lastName).orElseThrow(UserNotFoundException::new);
    }

}
