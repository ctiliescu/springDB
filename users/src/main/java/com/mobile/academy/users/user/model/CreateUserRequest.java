package com.mobile.academy.users.user.model;

import com.mobile.academy.users.user.service.repository.UserDao;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;

    public UserDao toDao() {
        UserDao userDao = new UserDao();
        userDao.setFirstName(this.firstName);
        userDao.setLastName(this.lastName);
        return userDao;
    }
}
