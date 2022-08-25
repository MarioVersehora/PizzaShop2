package com.practice.PizzaShop2.controller;

import com.practice.PizzaShop2.exception.NoClientException;
import com.practice.PizzaShop2.model.Orders;
import com.practice.PizzaShop2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("{clientId}")
    public Orders orderPizza(@RequestBody List<Integer> pizzasId, @PathVariable Integer clientId) throws NoClientException {
        return orderService.orderPizza(pizzasId, clientId);
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

}
