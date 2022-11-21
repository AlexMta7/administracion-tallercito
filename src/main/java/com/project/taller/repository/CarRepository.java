package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.taller.model.CarModel;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {

    @Query(value = "SELECT * FROM cars WHERE id_client = :id", nativeQuery = true)
    List<CarModel> getCarsByIdClient(@Param("id") Long id);
}
