package com.tashumi.showcase;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);
	
	@Autowired private MessageRepository repository;
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@PostMapping(path = "/messages", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String send(@RequestBody Message message) {
		logger.info(message.getMessage());
		repository.save(message);
		return message.getMessage();
	}

	@GetMapping("/messages")
	List<Message> all() {
		return repository.findAll();
	}

}
