package com.project.taller.service;

import com.project.taller.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public String saveCar(CarModel ca) {
        try {
            carRepository.save(ca);
            return "OK";
        }catch (Exception e){
            return "FAIL: " + e;
        }
    }

    public List<CarModel> getCars() {
        return carRepository.findAll();
    }

    public String deleteCar(Long id) {
        try {
            carRepository.deleteById(id);
            return "OK";
        }catch (Exception e){
            return "FAIL: " + e;
        }
    }

    public CarModel getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public List<CarModel> getCarsByIdCient(Long id) {
        return carRepository.getCarsByIdCient(id);
    }
}
