package me.janscheidegger.test.websocket;


import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/hello/{id}")
    @SendTo("/topic/messages/{id}")
    public Message message(@DestinationVariable String id, Message message) {
        return new Message("Hellou from " +id+ " - " + message.getContent());
    }

}
