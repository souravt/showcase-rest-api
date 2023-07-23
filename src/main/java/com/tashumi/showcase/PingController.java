package com.tashumi.showcase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	
  @GetMapping("/ping")
  String ping() {
    return "pong";
  }

}
