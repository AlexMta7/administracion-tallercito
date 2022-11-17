package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.taller.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

}
