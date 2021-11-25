package com.db.store.users;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentService {
    public void checkCardDetails(PaymentDetails paymentDetails) throws InvalidPaymentDetailsException {
        int randInt = new Random().nextInt(5);
        if (randInt < 3)
            throw new InvalidPaymentDetailsException();
    }
}
