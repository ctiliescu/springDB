package com.db.payment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardDetails {
    private String cardNumber;
    private String cvv;
    private String expirationInfo;
    private String name;
}
