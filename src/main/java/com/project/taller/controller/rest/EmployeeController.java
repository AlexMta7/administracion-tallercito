package com.project.taller.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.taller.model.EmployeeModel;
import com.project.taller.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /*
     * Create
     * Read
     * Update
     * Delete
     */

    // * Create
    @PostMapping()
    public String addEmployee(@RequestBody EmployeeModel employee) {
        try{
            employeeService.addEmployee(employee);
            return "OK";
        }
        catch(){
            return "FAIL";
        }
    }

    // * Read
    @GetMapping()
    public List<EmployeeModel> getEmployees() {
        try {
            return employeeService.getEmployees();
        } catch (Exception e) {
            return null;
        }
    }

    // * Update
    @PutMapping()
    public String updateEmployee(@RequestBody EmployeeModel employee) {
        try {
            employeeService.updateEmployee(employee);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // * Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        try {
            employeeService.deleteEmployee(id);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // Obtiene un dato por ID
    @GetMapping("/{id}")
    public EmployeeModel getEmployee(@PathVariable Long id) {
        try {
            return employeeService.getEmployee(id);
        } catch (Exception e) {
            return null;
        }
    }
}
