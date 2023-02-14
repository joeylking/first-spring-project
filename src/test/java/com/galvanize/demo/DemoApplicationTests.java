package com.galvanize.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void returnNumberShouldReturnOne(){
		int actual = DemoApplication.returnNumber();
		assertEquals("",1, actual);
	}

}
