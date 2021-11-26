package com.db.store.payments.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDetails {
    private String cardNumber;
    private String cvv;
    private String expirationInfo;
}
