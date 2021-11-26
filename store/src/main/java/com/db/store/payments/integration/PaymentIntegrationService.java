package com.db.store.payments.integration;

import com.db.store.exceptions.InvalidPaymentDetailsException;
import com.db.store.payments.model.CardDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
