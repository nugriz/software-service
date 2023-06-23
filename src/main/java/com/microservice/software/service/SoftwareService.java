package com.microservice.software.service;

import java.util.List;

import com.microservice.software.model.Software;
public interface SoftwareService {

    List<Software> findAll();

    Software findById(Long id);

    Software update(Long id, Software software);

    Software create(Software software);
    
    void delete(Long id);
}