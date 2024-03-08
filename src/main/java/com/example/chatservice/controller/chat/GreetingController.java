package com.example.chatservice.controller.chat;

import com.example.chatservice.Greeting;
import com.example.chatservice.HelloMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private final SimpMessageSendingOperations sendingOperations;


    @MessageMapping("/hello") // /app/hello
//    @SendTo("/topic/greeting")
    public void greeting(HelloMessage message) throws Exception {
        Greeting greeting = new Greeting("hello, " + HtmlUtils.htmlEscape(message.getName()));
        sendingOperations.convertAndSend("/topic/greeting", greeting);
    }

}
