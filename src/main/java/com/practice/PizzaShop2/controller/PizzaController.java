package com.practice.PizzaShop2.controller;

import com.practice.PizzaShop2.exception.NoIngredientException;
import com.practice.PizzaShop2.exception.NoPizzaException;
import com.practice.PizzaShop2.model.Pizza;
import com.practice.PizzaShop2.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }

    @PostMapping
    public Pizza savePizza(@RequestBody Pizza pizza) {
        return pizzaService.savePizza(pizza);
    }

    @PostMapping("add-ingredient/{pizzaId}/{ingredientId}")
    public Pizza addIngredient(@PathVariable Integer pizzaId, @PathVariable Integer ingredientId) throws NoPizzaException, NoIngredientException {
        return pizzaService.addIngredient(pizzaId, ingredientId);
    }
}

