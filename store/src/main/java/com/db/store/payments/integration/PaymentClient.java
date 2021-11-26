package com.db.store.payments.integration;

import com.db.store.payments.model.CardDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(value = "paymentClient", url = "localhost:8082/payment/api/v1")
public interface PaymentClient {

    @RequestMapping(method = POST, value = "checkCardDetails")
    void checkCardDetails(CardDetails cardDetails);
}
