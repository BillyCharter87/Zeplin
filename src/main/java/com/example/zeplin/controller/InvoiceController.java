package com.example.zeplin.controller;

import com.example.zeplin.model.Invoice;
import com.example.zeplin.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;


    @GetMapping("/get-all-invoices")
    public List<Invoice> getAllInvoice() {
        return invoiceService.getAllInvoices();
    }

    @GetMapping("/get-all-past-due-invoices-counts")
    public Integer getAllPastDueInvoicesCounts() {
        return invoiceService.getAllPastDueInvoicesCounts();
    }


    @PostMapping("/add-invoice")
    public Invoice saveContract(@RequestBody Invoice invoice) {
        return invoiceService.addInvoice(invoice);
    }

}