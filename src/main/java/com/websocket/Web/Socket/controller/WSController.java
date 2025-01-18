package com.websocket.Web.Socket.controller;

import com.websocket.Web.Socket.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WSController {
    @MessageMapping("/send")
    @SendTo("/topic/notification")
    public Message sendMessage( @Payload Message msg){
        return msg;
    }
}
