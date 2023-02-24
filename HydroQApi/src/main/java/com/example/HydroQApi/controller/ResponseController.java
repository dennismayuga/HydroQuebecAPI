package com.example.HydroQApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HydroQApi.model.Response;

@RequestMapping("/api") //base address for controller
@RestController
public class ResponseController {

    /*
     * this should only have ONE get method 
     * at least that's how I plan to implement it...
     * 
     * 
     * 
     * 
     */



// localhost:8080/api/getResponse
@GetMapping("/getResponse")
public Response getResponse() {

    

    return getResponse();
}

    
}
