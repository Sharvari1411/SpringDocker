package com.sharvari;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerApplicationTests {
	private final static int EXPECTED_PORT = 7777;
	
	@Autowired
	WelcomeController welcomeController;
	@Test
	void contextLoads() {
		int serverPort=welcomeController.returnServerPort();
		assertEquals(EXPECTED_PORT,serverPort);
	}

}
