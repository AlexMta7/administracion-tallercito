package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.taller.model.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {

}
