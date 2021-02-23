package com.sharvari;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerApplicationTests {
	private final static int EXPECTED_PORT = 7777;
	@Value("${server.port}")
	private int serverPort;
	@Test
	void contextLoads() {
		assertEquals(EXPECTED_PORT,serverPort);
	}

}
