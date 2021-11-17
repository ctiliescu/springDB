package com.mobile.academy.db.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloMessage(ObjectResponse objectResponse) {
       return "hello " + objectResponse.getMessage() + objectResponse.getName();
    }
}
