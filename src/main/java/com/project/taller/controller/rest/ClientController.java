package com.project.taller.controller.rest;

import com.project.taller.model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.taller.service.ClientService;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:3000" })
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Agrega un nuevo cliente a la Base de Datos
    @RequestMapping(value = "/api/clients", method = RequestMethod.POST)
    public String saveClient(@RequestBody ClientModel c) {
        try {
            clientService.saveClient(c);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // Listar todos los clientes existentes
    @RequestMapping(value = "/api/clients", method = RequestMethod.GET)
    public List<ClientModel> getClients() {
        return clientService.getClients();
    }

    // Borrar un cliente por medio del id asignado
    @RequestMapping(value = "/api/clients/{id}", method = RequestMethod.DELETE)
    public String deleteClient(@PathVariable Long id) {
        try {
            clientService.deleteClient(id);
            return "OK";
        } catch (Exception e) {
            return "FAIL: " + e;
        }
    }

    // Busqueda de cliente por medio del ID
    @RequestMapping(value = "/api/clients/{id}", method = RequestMethod.GET)
    public ClientModel getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    // Busqueda de cliente por medio de DUI
    @RequestMapping(value = "/api/clients/{dui}", method = RequestMethod.GET)
    public ClientModel getClientByDui(@PathVariable String dui) {
        return clientService.getClientByDui(dui);
    }

}
