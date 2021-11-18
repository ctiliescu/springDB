package com.mobile.academy.users;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    public UsersService() {
        System.out.println("------------------------> Init UsersService from external module");
    }
}
