package com.practice.PizzaShop2.service;

import com.practice.PizzaShop2.exception.NoClientException;
import com.practice.PizzaShop2.model.Client;
import com.practice.PizzaShop2.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Integer id) throws NoClientException {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isEmpty()) {
            throw new NoClientException("No client found");
        }

        return client.get();
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }

}
