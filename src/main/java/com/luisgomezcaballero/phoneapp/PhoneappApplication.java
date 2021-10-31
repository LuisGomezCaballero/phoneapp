package com.luisgomezcaballero.phoneapp;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luisgomezcaballero.phoneapp.model.Phone;
import com.luisgomezcaballero.phoneapp.repository.PhoneRepository;

@SpringBootApplication
public class PhoneappApplication {

	private static final Logger log = LoggerFactory.getLogger(PhoneappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PhoneappApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PhoneRepository repository) {
		log.info("Saving phone data into the database...");

		return args -> {
			Phone phone1 = new Phone();
			phone1.setImage("1https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-13-pro-max-01.jpg");
			phone1.setName("Apple iPhone 13 Pro Max");
			phone1.setDescription("iOS 15, upgradable to iOS 15.1");
			phone1.setPrice(new BigDecimal("1099"));

			repository.save(phone1);

			Phone phone2 = new Phone();
			phone2.setImage("https://fdn2.gsmarena.com/vv/pics/sony/sony-xperia-pro-i-1.jpg");
			phone2.setName("Sony Xperia Pro-I");
			phone2.setDescription("Android 11");
			phone2.setPrice(new BigDecimal("1800"));

			repository.save(phone2);

			Phone phone3 = new Phone();
			phone3.setImage("https://fdn2.gsmarena.com/vv/pics/google/google-pixel-6-pro-1.jpg");
			phone3.setName("Google Pixel 6 Pro");
			phone3.setDescription("Android 12");
			phone3.setPrice(new BigDecimal("1449.99"));

			repository.save(phone3);
		};
	}
}
