package com.project.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.taller.model.ServiceModel;

public interface ServiceRepository extends JpaRepository<ServiceModel, Long> {

}
