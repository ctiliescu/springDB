package com.mobile.academy.users;

import com.mobile.academy.core.CoreDisplayMessage;
import org.springframework.stereotype.Service;


@Service
public class UsersService {
    public UsersService() {
        CoreDisplayMessage.display("Init User Service");
    }
}
