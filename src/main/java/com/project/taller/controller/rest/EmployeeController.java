package com.project.taller.controller.rest;

import java.util.List;

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
        employeeService.addEmployee(employee);
        return "OK";
    }

    // * Read
    @GetMapping()
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    // * Update
    @PutMapping()
    public String updateEmployee(@RequestBody EmployeeModel employee) {
        employeeService.updateEmployee(employee);
        return "OK";
    }

    // * Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "OK";
    }
}
