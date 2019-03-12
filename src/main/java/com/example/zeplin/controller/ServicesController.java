package com.example.zeplin.controller;

import com.example.zeplin.model.Services;
import com.example.zeplin.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ServicesController {

    @Autowired
    private ServicesService servicesService;


    @GetMapping("/get-all-services")
    public List<Services> getAllInvoice() {
        return servicesService.getAllServices();
    }


    @PostMapping("/add-service")
    public Services saveContract(@RequestBody Services services) {
        return servicesService.addService(services);
    }

}