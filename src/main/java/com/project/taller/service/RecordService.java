package com.project.taller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.taller.repository.RecordRepository;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;
}
