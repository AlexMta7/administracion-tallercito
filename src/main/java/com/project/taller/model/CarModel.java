package com.project.taller.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_client;
    private String brand;
    private String model;
    private String color;
    private String year;
}
