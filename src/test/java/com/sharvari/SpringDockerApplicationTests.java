package com.sharvari;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest
@TestPropertySource("/application-prod.properties")
class SpringDockerApplicationTests {
	private final static int EXPECTED_PORT = 7777;
	@Value("${server.port}")
	private int serverPort;
	@Autowired
	WelcomeController welcomeController;
	@Test
	void contextLoads() {
		assertEquals(EXPECTED_PORT,serverPort);
	}

}

