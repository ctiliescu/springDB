package com.db.store.users;

import com.db.store.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userRepository.save(userEntity);
        return userEntity;
    }

    public UserEntity getUserByEmail(String email) throws UserNotFoundException {
        Optional<UserEntity> userByEmail = userRepository.getUserByEmail(email);
        if (userByEmail.isPresent()) {
            return userByEmail.get();
        } else {
            throw new UserNotFoundException();
        }
    }
}
