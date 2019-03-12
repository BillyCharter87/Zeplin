package com.example.zeplin.service;

import com.example.zeplin.model.Services;

import java.util.List;

public interface ServicesService {
    List<Services> getAllServices();
    Services addService(Services invoice);
}
