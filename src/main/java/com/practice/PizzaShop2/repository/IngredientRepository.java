package com.practice.PizzaShop2.repository;

import com.practice.PizzaShop2.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
