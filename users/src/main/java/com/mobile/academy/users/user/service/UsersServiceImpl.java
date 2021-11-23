package com.mobile.academy.users.user.service;

import com.mobile.academy.core.CoreDisplayMessage;
import com.mobile.academy.users.user.model.CreateUserRequest;
import com.mobile.academy.users.user.service.repository.UserDao;
import com.mobile.academy.users.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService {
    // done for demo purposes
    private CoreDisplayMessage coreDisplayMessage;

    public UsersServiceImpl(@Autowired CoreDisplayMessage cdm) {
        this.coreDisplayMessage = cdm;
        coreDisplayMessage.display("Init UserDao Service");
    }

    public void function() {
        coreDisplayMessage.display("Init UserDao Service");
    }
    // end of purposes

    @Autowired
    private UserRepository userRepository;

    public void createNewUser(CreateUserRequest createUserRequest) {
        userRepository.save(createUserRequest.toDao());
    }

    @Override
    public List<UserDao> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserDao getUserByLastName(String lastName) {
        return userRepository.findByLaaastName(lastName);
    }


}
