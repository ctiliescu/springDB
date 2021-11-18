package com.mobile.academy.db.multiplebeans;

import com.mobile.academy.db.hello.ObjectResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class SecondDisplayServiceImpl implements  DisplayService {
    @Override
    public String getName() {
        return "SecondDisplayServiceImpl";
    }

    @Override
    public String prettyPrint(ObjectResponse objectResponse) {
        return objectResponse.getMessage().toUpperCase(Locale.ROOT) + " " + objectResponse.getName().toUpperCase(Locale.ROOT);
    }
}
