package com.mobile.academy.db.demo.scanning;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SlaveComponent {
    public SlaveComponent() {
        System.out.println("------------------------> SlaveComponent");
    }

    @PostConstruct
    void init() {
        System.out.println("------------------------> post construct SlaveComponent" );
    }
}
