package com.practice.PizzaShop2.repository;

import com.practice.PizzaShop2.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
