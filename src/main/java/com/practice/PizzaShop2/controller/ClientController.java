package com.practice.PizzaShop2.controller;

import com.practice.PizzaShop2.exception.NoClientException;
import com.practice.PizzaShop2.model.Client;
import com.practice.PizzaShop2.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("client")
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("{id}")
    public Client getClientById(@PathVariable Integer id) throws NoClientException {
        return clientService.getClientById(id);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable Integer id) {
        clientService.deleteClient(id);
    }


}
