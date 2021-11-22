package com.mobile.academy.users;

import com.mobile.academy.core.CoreDisplayMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersService {

    private CoreDisplayMessage coreDisplayMessage;

    public UsersService(@Autowired CoreDisplayMessage cdm) {
        this.coreDisplayMessage = cdm;
        coreDisplayMessage.display("Init User Service");
    }

    public void function() {
        coreDisplayMessage.display("Init User Service");
    }
}
