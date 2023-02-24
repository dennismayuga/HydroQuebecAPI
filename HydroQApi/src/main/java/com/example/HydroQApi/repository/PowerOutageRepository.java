package com.example.HydroQApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HydroQApi.model.PowerOutage;

public interface PowerOutageRepository extends JpaRepository<PowerOutage,Integer>{  // Connecting to JPA repository passing employee object
    
}
