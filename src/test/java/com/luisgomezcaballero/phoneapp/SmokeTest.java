package com.luisgomezcaballero.phoneapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.luisgomezcaballero.phoneapp.controller.PhoneController;

@SpringBootTest
class SmokeTest {

	@Autowired
	private PhoneController phoneController;

	@Test
	void contextLoads() throws Exception {
		assertThat(phoneController).isNotNull();
	}
}
