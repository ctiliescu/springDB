package com.mobile.academy.db.multiplebeans;

import com.mobile.academy.db.hello.ObjectResponse;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service("FirstDisplayServiceImpl")
@Profile("dev")
public class FirstDisplayServiceImpl implements  DisplayService {
    @Override
    public String getName() {
        return "FirstDisplayServiceImpl";
    }

    @Override
    public String prettyPrint(ObjectResponse objectResponse) {
        return objectResponse.getMessage().toUpperCase(Locale.ROOT);
    }
}
