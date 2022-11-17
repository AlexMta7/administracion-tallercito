package com.project.taller.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "services")
public class ServiceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String description;
}
