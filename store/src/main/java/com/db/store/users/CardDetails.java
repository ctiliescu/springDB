package com.db.store.users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardDetails {
    private String cardNumber;
    private String cvv;
    private String expirationInfo;
    private String name;

    public CardDetails(PaymentDetails paymentDetails, String name) {
        cardNumber = paymentDetails.getCardNumber();
        cvv = paymentDetails.getCvv();
        expirationInfo = paymentDetails.getExpirationInfo();
        this.name = name;
    }
}
