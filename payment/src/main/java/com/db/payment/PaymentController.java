package com.db.payment;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PaymentController {

    @PostMapping("payment/api/v1/checkCardDetails")
    ResponseEntity<?> validateCardDetails(@RequestBody CardDetails cardDetails) {
        int randInt = new Random().nextInt(10);
        if (randInt < 3)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        else
            return new ResponseEntity(HttpStatus.OK);
    }
}
