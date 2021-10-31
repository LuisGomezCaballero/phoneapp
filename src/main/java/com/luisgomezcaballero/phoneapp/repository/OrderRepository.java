package com.luisgomezcaballero.phoneapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luisgomezcaballero.phoneapp.model.ShopOrder;

@Repository
public interface OrderRepository extends CrudRepository<ShopOrder, Long> {

}
