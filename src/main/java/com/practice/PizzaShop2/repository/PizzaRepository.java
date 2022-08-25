package com.practice.PizzaShop2.repository;

import com.practice.PizzaShop2.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    List<Pizza> findByIdIn(List<Integer> list);
}
