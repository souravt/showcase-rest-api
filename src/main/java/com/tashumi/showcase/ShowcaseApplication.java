package com.tashumi.showcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tashumi.showcase")
@ComponentScan(basePackages = { "com.tashumi.showcase" })
@EntityScan("com.tashumi.showcase")  
public class ShowcaseApplication {
	/**
	 * https://spring.io/guides/tutorials/rest/
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(ShowcaseApplication.class, args);
	}

}
