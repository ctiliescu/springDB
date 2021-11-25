package com.db.store.users;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("store/v1/api/users")
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    void createUser(@RequestBody User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userRepository.save(userEntity);
        log.info("saved user: {}", user.getEmail());
    }

    @GetMapping
    UserEntity getUserByEmail(@RequestParam String email){
        log.info("search for user: " + email);
        return userRepository.getUserByEmail(email);
    }
}
