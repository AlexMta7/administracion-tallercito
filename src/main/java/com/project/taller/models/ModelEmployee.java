package com.project.taller.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class ModelEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String type;
    private String dui;
    private String email;
    private String cod_empl;
}
