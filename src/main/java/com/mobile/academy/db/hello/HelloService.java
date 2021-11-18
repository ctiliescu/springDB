package com.mobile.academy.db.hello;

import com.mobile.academy.db.multiplebeans.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.stream.Collectors;


@Service
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HelloService {
    @Autowired
    private List<DisplayService> displayService;

    @Autowired
    @Qualifier("FirstDisplayServiceImpl")
    private DisplayService displayService_First;

    public HelloService() {
        System.out.println(" ------> Create HelloService");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(" ------> Create HelloService destroy");
    }

    public String helloMessage(ObjectResponse objectResponse) {
        if(objectResponse.getName().length() > 3) {
            return "hello " + displayService.get(0).prettyPrint(objectResponse);
        } else {
            return displayService.stream().map(e -> e.prettyPrint(objectResponse)).collect(Collectors.joining());
        }
    }
}
