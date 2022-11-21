package com.project.taller.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "records")
public class RecordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_employee;
    private Long id_car;
    private Long id_service;
    private String date;
    private String note;
    private String status;
}
