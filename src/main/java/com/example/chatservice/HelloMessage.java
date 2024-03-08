package com.example.chatservice;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HelloMessage {
    private String name;

    public HelloMessage(String name) {
        this.name = name;
    }
}
