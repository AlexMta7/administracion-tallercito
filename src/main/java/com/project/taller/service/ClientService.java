package com.project.taller.service;

import com.project.taller.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public String saveClient(ClientModel c) {
        try {
            clientRepository.save(c);
            return "OK";
        }catch (Exception e){
            return "FAIL: " + e;
        }
    }

    public List<ClientModel> getClients() {
        return clientRepository.findAll();
    }

    public String deleteClient(Long id) {
        try {
            clientRepository.deleteById(id);
            return "OK";
        }catch (Exception e){
         return "FAIL: " + e;
        }
    }

    public ClientModel getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public ClientModel getClientByDui(String dui) {
        return clientRepository.findByDui(dui);
    }
}
