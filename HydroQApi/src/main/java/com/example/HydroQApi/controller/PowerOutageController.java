package com.example.HydroQApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HydroQApi.model.PowerOutage;
import com.example.HydroQApi.service.PowerOutageService;

import jakarta.validation.Valid;

@RequestMapping("/api") //base address for controller
@RestController
public class PowerOutageController {

    @Autowired
    private PowerOutageService pService;     

    
// localhost:8080/api/getPowerOutages
@GetMapping("/getPowerOutages")
public List<PowerOutage> getPowerOutages() {

    return pService.getPowerOutages();
}

// localhost:8080/api/getPowerOutageById/19
@GetMapping("/getPowerOutageById/{id}")
public PowerOutage getPowerOutageById(@PathVariable("id") int id) {   
    return pService.getSinglePowerOutage(id);
}
// localhost:8080/api/addPowerOutage
@PostMapping("/addPowerOutage")
public PowerOutage postPowerOutage(@Valid @RequestBody PowerOutage poweroutage) {       // added @Valid to enforce JPA Validators
    pService.savePowerOutage(poweroutage);
    return pService.savePowerOutage(poweroutage);
}
// localhost:8080/api/updatePowerOutage/19
@PutMapping("/updatePowerOutage/{id}")
public PowerOutage putPowerOutageById(@PathVariable("id") int id,@Valid @RequestBody PowerOutage poweroutage) { // added @Valid to enforce JPA Validators
    poweroutage.setId(id);
    return pService.updatePowerOutage(poweroutage);
}

// localhost:8080/api/deletePowerOutage?id=19
@DeleteMapping("/deletePowerOutage")
public String deletePowerOutageById(@RequestParam("id") int id) {
    return "Deleted Power Outage for id "+id;
}









}
