package com.project.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.model.ServiceModel;
import com.project.taller.repository.ServiceRepository;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public ServiceModel addService(ServiceModel service) {
        return serviceRepository.save(service);
    }

    public List<ServiceModel> getServices() {
        return serviceRepository.findAll();
    }

    public ServiceModel updateService(ServiceModel service) {
        return serviceRepository.save(service);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    public ServiceModel getService(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }
}
