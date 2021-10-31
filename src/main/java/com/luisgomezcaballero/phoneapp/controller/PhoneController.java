package com.luisgomezcaballero.phoneapp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luisgomezcaballero.phoneapp.model.ShopOrder;
import com.luisgomezcaballero.phoneapp.model.Phone;
import com.luisgomezcaballero.phoneapp.service.PhoneService;

@RestController
public class PhoneController {

	private static final Logger log = LoggerFactory.getLogger(PhoneController.class);

	@Autowired
	PhoneService phoneCatalogService;

	@GetMapping("/phones")
	public List<Phone> getPhones() {
		return phoneCatalogService.getPhones();
	}

	@PostMapping("/place-order")
	public BigDecimal placeOrder(@RequestBody ShopOrder order) {
		log.info("{}", order);

		return phoneCatalogService.placeOrder(order.getCart());
	}
}
