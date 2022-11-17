package com.project.taller.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class ModelClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String dui;
    private String email;
    private String phone;
}
