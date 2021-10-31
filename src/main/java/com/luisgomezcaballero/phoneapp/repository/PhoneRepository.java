package com.luisgomezcaballero.phoneapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luisgomezcaballero.phoneapp.model.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Long> {

}
