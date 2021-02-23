package com.sharvari;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerApplicationTests {
	private final static int EXPECTED_PORT = 8190;
	@Value("${server.port}")
	private int serverPort;
	@Test
	void contextLoads() {
		assertEquals(EXPECTED_PORT,serverPort);
	}

}
