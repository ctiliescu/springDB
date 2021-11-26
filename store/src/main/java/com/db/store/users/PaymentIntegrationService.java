package com.db.store.users;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentIntegrationService {

    @Autowired
    PaymentClient paymentClient;

    public void checkCardDetails(CardDetails cardDetails) throws InvalidPaymentDetailsException {
        try {
            paymentClient.checkCardDetails(cardDetails);
        } catch (Exception e) {
            throw new InvalidPaymentDetailsException();
        }
    }
}
