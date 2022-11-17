package com.project.taller.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class ClientModel {

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
