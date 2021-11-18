package com.mobile.academy.db.demo.scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MasterComponent {
    @Autowired
    private SlaveComponent slaveComponent;

    public MasterComponent() {
        System.out.println("------------------------> MasterComponent");
    }


    @PostConstruct
    void init() {
        System.out.println("------------------------> post construct MasterComponent " + slaveComponent );
    }
}
