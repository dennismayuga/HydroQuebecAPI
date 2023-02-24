package com.example.HydroQApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HydroQApi.model.PowerOutage;
import com.example.HydroQApi.repository.PowerOutageRepository;

@Service
public class PowerOutageImpl implements PowerOutageService{
    
    @Autowired
    private PowerOutageRepository pRepository;     // Calling all JPA methods

    @Override
    public List<PowerOutage> getPowerOutages() {
        return pRepository.findAll();
    }
    
    @Override
    public PowerOutage savePowerOutage(PowerOutage powerOutage) {
        return pRepository.save(powerOutage);
    }
    
    @Override
    public PowerOutage getSinglePowerOutage(Integer id) {
        Optional<PowerOutage> poweroutage = pRepository.findById(id);
        if(poweroutage.isPresent()){
            return poweroutage.get();
        }
        throw new RuntimeException("PowerOutage is not found for the id "+id);
        }
    
    
    
    @Override
    public void deletePowerOutage(Integer id) {
    pRepository.deleteById(id);
    }
    
    @Override
    public PowerOutage updatePowerOutage(PowerOutage powerOutage) {
    return pRepository.save(powerOutage);
    
    }


}
