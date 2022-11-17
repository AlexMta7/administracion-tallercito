package com.project.taller.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "services")
public class ModelService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String description;
}
