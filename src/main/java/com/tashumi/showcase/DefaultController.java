package com.tashumi.showcase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	private static Logger logger = LogManager.getLogger(DefaultController.class);

	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@PostMapping(path="/messages", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String send(@RequestBody Message message) {
		logger.log(logger.getLevel(), message.getMessage());

		return message.getMessage();
	}

}
