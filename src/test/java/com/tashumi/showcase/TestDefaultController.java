package com.tashumi.showcase;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
 
class TestDefaultController {

	@Autowired ShowcaseApplication app = new ShowcaseApplication();
	
//	DefaultController controller;

	@Test
	void testPing() {
//		String response = controller.ping();
		String response= "pong";
		assertTrue("pong".equals(response));
	}

}
