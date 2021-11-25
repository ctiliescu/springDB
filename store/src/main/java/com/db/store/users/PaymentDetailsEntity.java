package com.db.store.users;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;

@Entity
@Table(name= "payment")
@Getter
@Setter
public class PaymentDetailsEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "cvv")
    private String cvv;

    @Column(name = "expiration_info")
    private String expirationInfo;

    @Column(name = "user_id")
    private long userId;

    public PaymentDetailsEntity(String cardNumber, String cvv, String expirationInfo, long userId) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationInfo = expirationInfo;
        this.userId = userId;
    }
}
