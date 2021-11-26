package com.db.store.users.service;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import com.db.store.exceptions.UserNotFoundException;
import com.db.store.payments.PaymentRepository;
import com.db.store.payments.model.CardDetails;
import com.db.store.payments.model.PaymentDetails;
import com.db.store.payments.model.PaymentDetailsEntity;
import com.db.store.users.model.*;
import com.db.store.payments.integration.PaymentIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PaymentIntegrationService paymentIntegrationService;

    @Autowired
    private PaymentRepository paymentRepository;

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

    public UserEntity getUserById(long userId) throws UserNotFoundException {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    public void addPaymentDetails(long userId, PaymentDetails paymentDetails) throws UserNotFoundException, InvalidPaymentDetailsException {
        UserEntity user = getUserById(userId);

        paymentIntegrationService.checkCardDetails(new CardDetails(paymentDetails, user.getFirstName() + " " + user.getLastName()));

        paymentRepository.save(new PaymentDetailsEntity(paymentDetails.getCardNumber(), paymentDetails.getCvv(), paymentDetails.getExpirationInfo(), userId));
    }
}
