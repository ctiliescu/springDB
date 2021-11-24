package com.mobile.academy.users.user.model;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("user not found custom message");
    }
}
