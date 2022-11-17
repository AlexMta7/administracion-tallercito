package com.project.taller.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "records")
public class ModelRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_employee;
    private Long id_car;
    private Long id_service;
    private String date;
    private String note;
}
