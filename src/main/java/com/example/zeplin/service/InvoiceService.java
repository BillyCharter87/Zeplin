package com.example.zeplin.service;

import com.example.zeplin.model.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAllInvoices();
    Invoice addInvoice(Invoice invoice);
}
