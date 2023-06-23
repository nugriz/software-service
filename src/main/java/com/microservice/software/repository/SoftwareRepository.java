package com.microservice.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.software.model.Software;

/**
 * @author fascal
 */
public interface SoftwareRepository extends JpaRepository<Software, Long> {

}