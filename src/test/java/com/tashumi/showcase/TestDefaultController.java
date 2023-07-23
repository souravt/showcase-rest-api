package com.tashumi.showcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDefaultController {
	
	

	@Test
	void testPing() {
		DefaultController controller = new DefaultController();
		String response  = controller.ping();
		assertTrue("pong".equals(response));
	}

}
