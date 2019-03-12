package com.example.zeplin.service.impl;

import com.example.zeplin.model.Services;
import com.example.zeplin.repository.InvoiceRepository;
import com.example.zeplin.repository.ServicesRepository;
import com.example.zeplin.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicesServiceImpl implements ServicesService {


    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    ServicesRepository servicesRepository;

    @Override
    public List<Services> getAllServices() {

        return servicesRepository.findAll();
    }

    @Override
    public Services addService(Services services) {

        return servicesRepository.save(services);
    }

}
