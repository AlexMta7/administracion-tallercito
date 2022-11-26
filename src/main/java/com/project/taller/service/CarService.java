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

    public CarModel saveCar(CarModel ca) {
        return carRepository.save(ca);

    }

    public List<CarModel> getCars() {
        return carRepository.findAll();
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public CarModel getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public List<CarModel> getCarsByIdClient(Long id) {
        return carRepository.getCarsByIdClient(id);
    }

    public CarModel updateCar(CarModel ca) {
        return carRepository.save(ca);
    }
}
