package com.db.store.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDetails {
    private String cardNumber;
    private String cvv;
    private String expirationInfo;
}
