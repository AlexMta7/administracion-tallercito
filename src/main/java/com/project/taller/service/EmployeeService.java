package com.project.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.model.EmployeeModel;
import com.project.taller.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(EmployeeModel employee) {
        employeeRepository.save(employee);
    }

    public List<EmployeeModel> getEmployees() {
        return employeeRepository.findAll();
    }

    public void updateEmployee(EmployeeModel employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
