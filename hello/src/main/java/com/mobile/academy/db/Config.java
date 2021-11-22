package com.mobile.academy.db;

import com.mobile.academy.core.ComponentForCDM;
import com.mobile.academy.core.CoreDisplayMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public CoreDisplayMessage coreDisplayMessage() {
        CoreDisplayMessage coreDisplayMessage = new CoreDisplayMessage(new ComponentForCDM());
        return coreDisplayMessage;
    }

    @Bean
    @Primary
    public CoreDisplayMessage coreDisplayMessage2() {
        CoreDisplayMessage coreDisplayMessage = new CoreDisplayMessage(new ComponentForCDM());
        return coreDisplayMessage;
    }
}
