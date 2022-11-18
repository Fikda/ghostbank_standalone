package com.ghostbank.controller;

import com.ghostbank.model.Client;
import com.ghostbank.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired // adiciona uma instância automaticamente.
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> listar() {
        return clientRepository.findAll();

    }
     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     public Client toAdd(@RequestBody Client client) {
        return clientRepository.save(client);
     }


}

 /*
    @GetMapping
    public String hello(){
        return "Hello, world!";
    }

     */
