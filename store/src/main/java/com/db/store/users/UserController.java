package com.db.store.users;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import com.db.store.exceptions.UserNotFoundException;
import com.db.store.payments.model.PaymentDetails;
import com.db.store.users.model.User;
import com.db.store.users.model.UserEntity;
import com.db.store.users.service.UserService;
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
    UserEntity getUserByEmail(@RequestParam String email) throws UserNotFoundException {
        log.info("search for user: " + email);
        return userService.getUserByEmail(email);
    }

    @PostMapping("/{userId}/paymentDetails")
    public void addPaymentDetails(@RequestBody PaymentDetails paymentDetails,
                                  @PathVariable long userId) throws InvalidPaymentDetailsException, UserNotFoundException {
        userService.addPaymentDetails(userId, paymentDetails);
    }
}
