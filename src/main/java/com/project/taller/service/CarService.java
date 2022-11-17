package com.project.taller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.repository.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
}
