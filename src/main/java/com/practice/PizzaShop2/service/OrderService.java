package com.practice.PizzaShop2.service;

import com.practice.PizzaShop2.exception.NoClientException;
import com.practice.PizzaShop2.model.Client;
import com.practice.PizzaShop2.model.Orders;
import com.practice.PizzaShop2.repository.ClientRepository;
import com.practice.PizzaShop2.repository.OrderRepository;
import com.practice.PizzaShop2.repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final ClientRepository clientRepository;
    private final PizzaRepository pizzaRepository;

    public Orders orderPizza(List<Integer> pizzasId, Integer clientId) throws NoClientException {
        Optional<Client> client = clientRepository.findById(clientId);
        if (client.isEmpty()) {
            throw new NoClientException("No client found");
        }

        return orderRepository.save(Orders.builder()
                .client(client.get())
                .pizzas(pizzaRepository.findByIdIn(pizzasId))
                .build());
    }

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }


}
