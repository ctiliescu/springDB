package com.db.project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {


    @GetMapping("/api/v1/health")
    public String getHealth() {
        return "Service is up";
    }
}
