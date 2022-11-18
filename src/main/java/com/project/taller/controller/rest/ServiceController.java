package com.project.taller.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.NullNode;
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
        try {
            serviceService.addService(service);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // * Read
    @GetMapping()
    public List<ServiceModel> getServices() {
        try {
            return serviceService.getServices();
        } catch (Exception e) {
            return null;
        }
    }

    // * Update
    @PutMapping()
    public String updateService(@RequestBody ServiceModel service) {
        try {
            serviceService.updateService(service);
            return "OK";
        } catch (Exception e) {
            return null;
        }
    }

    // * Delete
    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable Long id) {
        try {
            serviceService.deleteService(id);
            return "OK";
        } catch (Exception e) {
            return null;
        }
    }

    // Busca elemento por ID
    @GetMapping("/{id}")
    public ServiceModel getService(@PathVariable Long id) {
        try {
            return serviceService.getService(id);
        } catch (Exception e) {
            return null;
        }
    }
}
