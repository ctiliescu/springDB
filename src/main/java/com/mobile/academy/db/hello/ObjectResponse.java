package com.mobile.academy.db.hello;

public class ObjectResponse {
    private String message;
    private String name;

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public ObjectResponse(String message, String name) {
        this.message = message;
        this.name = name;
    }
}
