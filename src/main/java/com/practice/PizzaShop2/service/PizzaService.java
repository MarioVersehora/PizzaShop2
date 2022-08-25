package com.practice.PizzaShop2.service;

import com.practice.PizzaShop2.exception.NoIngredientException;
import com.practice.PizzaShop2.exception.NoPizzaException;
import com.practice.PizzaShop2.model.Ingredient;
import com.practice.PizzaShop2.model.Pizza;
import com.practice.PizzaShop2.repository.IngredientRepository;
import com.practice.PizzaShop2.repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final IngredientRepository ingredientRepository;

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza savePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Pizza addIngredient(Integer pizzaId, Integer ingredientId) throws NoPizzaException, NoIngredientException {
        Optional<Pizza> pizza = pizzaRepository.findById(pizzaId);
        if (pizza.isEmpty()) {
            throw new NoPizzaException("No pizza found!");
        }

        Optional<Ingredient> ingredient = ingredientRepository.findById(ingredientId);
        if (ingredient.isEmpty()) {
            throw new NoIngredientException("No ingredient found!");
        }

        pizza.get().addIngredient(ingredient.get());
        return pizzaRepository.save(pizza.get());
    }

}
