package com.tashumi.showcase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class DataLoader {

  private static final Logger log = LoggerFactory.getLogger(DataLoader.class);

  @Bean
  CommandLineRunner initDatabase(MessageRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Message("1234-abc", "Welcome")));
      log.info("Preloading " + repository.save(new Message("1235-abc", "Hello")));
    };
  }
}