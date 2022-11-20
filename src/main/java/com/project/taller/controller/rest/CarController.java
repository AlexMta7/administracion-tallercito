package com.project.taller.controller.rest;

import com.project.taller.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.taller.service.CarService;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    // Agrega un nuevo automovil a la Base de Datos
    @RequestMapping(value = "/api/car", method = RequestMethod.POST)
    public String saveCar(@RequestBody CarModel ca) {
        try {
            carService.saveCar(ca);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // Listar todos los automoviles existentes
    @RequestMapping(value = "/api/cars", method = RequestMethod.GET)
    public List<CarModel> getCars() {
        return carService.getCars();
    }

    // Borrar un automovil por medio del id asignado
    @RequestMapping(value = "/api/car/{id}", method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable Long id) {
        try {
            carService.deleteCar(id);
            return "OK";
        } catch (Exception e) {
            return "FAIL: " + e;
        }
    }

    // Busqueda de automovil por medio del ID
    @RequestMapping(value = "/api/car/{id}", method = RequestMethod.GET)
    public CarModel getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    // Busqueda de automovil por medio del ID del Cliente
    @RequestMapping(value = "/api/cars/{id}", method = RequestMethod.GET)
    public List<CarModel> getCarsByIdClient(@PathVariable Long id) {
        return carService.getCarsByIdCient(id);
    }
}
