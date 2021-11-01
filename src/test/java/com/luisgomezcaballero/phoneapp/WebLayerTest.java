package com.luisgomezcaballero.phoneapp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.luisgomezcaballero.phoneapp.model.Phone;
import com.luisgomezcaballero.phoneapp.repository.PhoneRepository;
import com.luisgomezcaballero.phoneapp.service.PhoneService;

@WebMvcTest
class WebLayerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PhoneService phoneService;
	
	@MockBean
	private PhoneRepository phoneRepository;

	@Test
	void shouldReturnDefaultMessage() throws Exception {

		List<Phone> phones = new ArrayList<>();

		Phone phone1 = new Phone();
		phone1.setImage("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-13-pro-max-01.jpg");
		phone1.setName("Apple iPhone 13 Pro Max");
		phone1.setDescription("iOS 15, upgradable to iOS 15.1");
		phone1.setPrice(new BigDecimal("1099"));

		phones.add(phone1);

		when(phoneRepository.findAll()).thenReturn(phones);

		this.mockMvc.perform(get("/phones")).andDo(print()).andExpect(status().isOk());
	}
}
