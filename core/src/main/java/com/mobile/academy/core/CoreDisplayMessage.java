package com.mobile.academy.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoreDisplayMessage {
    private ComponentForCDM component;

    public CoreDisplayMessage(@Autowired ComponentForCDM component) {
        this.component = component;
    }

    public void display(String message) {
        component.display("asdasdasd");
        System.out.println("logging the message ----> " + message);
    }
}
