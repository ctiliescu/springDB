package com.mobile.academy.core;

import org.springframework.stereotype.Service;

@Service
public class CoreDisplayMessage {
    public void display(String message) {
        System.out.println("logging the message ----> " + message);
    }
}
