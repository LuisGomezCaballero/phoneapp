package com.luisgomezcaballero.phoneapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisgomezcaballero.phoneapp.model.Phone;
import com.luisgomezcaballero.phoneapp.repository.PhoneRepository;

@Service
public class PhoneService {
	
	@Autowired
	PhoneRepository phoneRepository;

	public List<Phone> getPhones() {
		List<Phone> phones;

		phones = (List<Phone>) phoneRepository.findAll();
		
		return phones;
	}

	public BigDecimal placeOrder(List<Phone> cart) {
		BigDecimal totalPrice;
		totalPrice = new BigDecimal("0");

		for (Phone phone : cart) {
			totalPrice = totalPrice.add(phone.getPrice());
		}

		return totalPrice;
	}
}
