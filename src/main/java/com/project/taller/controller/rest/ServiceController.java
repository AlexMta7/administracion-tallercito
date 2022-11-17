package com.project.taller.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.taller.service.ServiceService;

@RestController
public class ServiceController {

    @Autowired
    private ServiceService serviceService;
}
