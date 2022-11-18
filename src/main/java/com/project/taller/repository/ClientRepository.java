package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.taller.model.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    ClientModel findByDui(String dui);
}
