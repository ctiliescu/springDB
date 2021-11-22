package com.mobile.academy.db.demo.scanning;

import com.mobile.academy.core.CoreDisplayMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SlaveComponent {

    @Value("${server.port}")
    private String v;

    public SlaveComponent(@Autowired CoreDisplayMessage coreDisplayMessage) {
        coreDisplayMessage.display("Init SlaveComponent");
    }

    @PostConstruct
    void init() {
        System.out.println("------------------------> post construct SlaveComponent ---> " + v);
    }
}
