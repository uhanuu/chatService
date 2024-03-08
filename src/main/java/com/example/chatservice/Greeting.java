package com.example.chatservice;

import lombok.Getter;

@Getter
public class Greeting {
    private String message;

    public Greeting(String message) {
        this.message = message;
    }
}
