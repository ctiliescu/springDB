package com.mobile.academy.db.demo.scanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MasterComponent {
    private SlaveComponent slaveComponent;

    public MasterComponent(@Autowired SlaveComponent slaveComponent) {
        System.out.println("------------------------> MasterComponent");
        this.slaveComponent = slaveComponent;
        System.out.println(slaveComponent);
    }
}
