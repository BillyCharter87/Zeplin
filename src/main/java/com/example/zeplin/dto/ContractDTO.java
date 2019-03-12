package com.example.zeplin.dto;

import com.example.zeplin.model.Contract;
import com.example.zeplin.model.Invoice;
import com.example.zeplin.model.Services;

import java.util.List;

public class ContractDTO {

    private Contract contract;
    private List<Invoice> invoices;
    private List<Services> services;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<Invoice> getInvoice() {
        return invoices;
    }

    public void setInvoice(List<Invoice> invoice) {
        this.invoices = invoice;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }
}
