package com.example.zeplin.service.impl;

import com.example.zeplin.model.Invoice;
import com.example.zeplin.repository.InvoiceRepository;
import com.example.zeplin.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {


    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }

    @Override
    public Invoice addInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

}
