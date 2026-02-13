package com.example.websocketdemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

	@MessageMapping("/send")
	@SendTo("/topic/messages")
	public String sendMessage(String message) throws Exception {		
		return "Server time is " + java.time.LocalTime.now() + " and the message is : " + message;
	}
	
	
}
