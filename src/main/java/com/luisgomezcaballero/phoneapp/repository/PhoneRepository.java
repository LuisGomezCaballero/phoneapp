package com.luisgomezcaballero.phoneapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.luisgomezcaballero.phoneapp.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Long> {

}
