package com.project.taller.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.project.taller.model.ServiceModel;
import com.project.taller.service.ServiceService;

@RestController
@RequestMapping(value = "/api/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    /*
     * Create
     * Read
     * Update
     * Delete
     */

    // * Create
    @PostMapping()
    public String addService(@RequestBody ServiceModel service) {
        serviceService.addService(service);
        return "OK";
    }

    // * Read
    @GetMapping()
    public List<ServiceModel> getServices() {
        return serviceService.getServices();
    }

    // * Update
    @PutMapping()
    public String updateService(@RequestBody ServiceModel service) {
        serviceService.updateService(service);
        return "OK";
    }

    // * Delete
    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
        return "OK";
    }

    // Busca elemento por ID
    @GetMapping("/{id}")
    public ServiceModel getService(@PathVariable Long id) {
        return serviceService.getService(id);
    }
}
