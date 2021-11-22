package com.mobile.academy.users.user.service;

import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.service.repository.UserDao;

import java.util.List;

public interface UsersService {
    void createNewUser(CreateUserRequest createUserRequest);

    List<UserDao> getAllUsers();
}
