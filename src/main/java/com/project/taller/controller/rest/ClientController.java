package com.project.taller.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.taller.service.ClientService;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;
}
