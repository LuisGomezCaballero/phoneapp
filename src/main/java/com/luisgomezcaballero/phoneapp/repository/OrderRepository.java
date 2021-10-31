package com.luisgomezcaballero.phoneapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.luisgomezcaballero.phoneapp.model.ShopOrder;

public interface OrderRepository extends CrudRepository<ShopOrder, Long> {

}
