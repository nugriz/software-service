package com.microservice.software.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.software.model.Software;
import com.microservice.software.repository.SoftwareRepository;
import com.microservice.software.service.SoftwareService;

@Service
public class SoftwareServiceImpl implements SoftwareService {

    @Autowired
    SoftwareRepository softwareRepository;

    @Override
    public List<Software> findAll() {
        return softwareRepository.findAll();
    }

    @Override
    public Software findById(Long id) {
        return softwareRepository.getOne(id);
    }

    @Override
    public Software update(Long id, Software software) {
    	softwareRepository.findById(id);

		software.setId(id);
        return softwareRepository.save(software);
    }

    @Override
    public Software create(Software software) {
        return softwareRepository.save(software);
    }
    
    @Override
    public void delete(Long id) {
        softwareRepository.deleteById(id);
    }


}