package com.project.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.model.RecordModel;
import com.project.taller.repository.RecordRepository;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public RecordModel addRecord(RecordModel record) {
        return recordRepository.save(record);
    }

    public List<RecordModel> getRecords() {
        return recordRepository.findAll();
    }

    public RecordModel getRecord(Long id) {
        return recordRepository.findById(id).orElse(null);
    }

    public RecordModel updateRecord(RecordModel record) {
        return recordRepository.save(record);
    }

    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
