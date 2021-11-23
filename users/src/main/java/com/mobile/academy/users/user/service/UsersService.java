package com.mobile.academy.users.user.service;

import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.service.repository.UserDao;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    void createNewUser(CreateUserRequest createUserRequest);

    List<UserDao> getAllUsers();

    UserDao getUserByLastName(String lastName);

    Optional<UserDao> getUserByLastNamOp(String lastName);
}
