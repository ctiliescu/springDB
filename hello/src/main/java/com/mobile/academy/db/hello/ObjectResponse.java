package com.mobile.academy.db.hello;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObjectResponse {
    private String message;
    private String name;

    public ObjectResponse(String message, String name) {
        this.message = message;
        this.name = name;
    }
}
