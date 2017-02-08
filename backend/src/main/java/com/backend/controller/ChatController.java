package com.backend.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ChatController {
	private static final Logger log = LoggerFactory.getLogger(ChatController.class);

	@RequestMapping("/chat/info")
	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message)
	{
		log.debug("Calling the method sedMessage()");
		log.debug("Message id :" + message.getId());
		log.debug("Message    : " + message.getMessage());
		
		return new  OutputMessage(message, new Date());
	}
}