package com.practice.PizzaShop2.repository;

import com.practice.PizzaShop2.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
