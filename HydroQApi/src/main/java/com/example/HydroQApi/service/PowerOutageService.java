package com.example.HydroQApi.service;

import java.util.List;

import com.example.HydroQApi.model.PowerOutage;

public interface PowerOutageService {
    
    List<PowerOutage> getPowerOutages();
    PowerOutage savePowerOutage(PowerOutage poweroutage);
    PowerOutage getSinglePowerOutage(Integer id);
    void deletePowerOutage(Integer id);
    PowerOutage updatePowerOutage(PowerOutage poweroutage);



}
