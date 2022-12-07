package com.project.taller.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.taller.model.RecordModel;
import com.project.taller.service.RecordService;

@RestController
@RequestMapping("/api/records")
@CrossOrigin(origins = { "http://localhost:3000" })
public class RecordController {

    @Autowired
    private RecordService recordService;

    /*
     * Create
     * Read
     * Update
     * Delete
     */

    // * Create
    @PostMapping()
    public String addRecord(@RequestBody RecordModel record) {
        try {
            recordService.addRecord(record);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // * Read
    @GetMapping()
    public List<RecordModel> getRecords() {
        try {
            return recordService.getRecords();
        } catch (Exception e) {
            return null;
        }
    }

    // * Update
    @PutMapping()
    public String updateRecord(@RequestBody RecordModel record) {
        try {
            recordService.updateRecord(record);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // * Delete
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        try {
            recordService.deleteRecord(id);
            return "OK";
        } catch (Exception e) {
            return "FAIL";
        }
    }

    // Obtiene un registro específico por id
    @GetMapping("/{id}")
    public RecordModel getRecord(@PathVariable Long id) {
        try {
            return recordService.getRecord(id);
        } catch (Exception e) {
            return null;
        }
    }
}
