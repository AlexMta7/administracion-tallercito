package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.taller.model.RecordModel;

public interface RecordRepository extends JpaRepository<RecordModel, Long> {

}
