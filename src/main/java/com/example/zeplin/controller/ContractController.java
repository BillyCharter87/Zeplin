package com.example.zeplin.controller;

import com.example.zeplin.dto.ContractDTO;
import com.example.zeplin.model.Contract;
import com.example.zeplin.service.ContractService;
import com.example.zeplin.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class ContractController {

    @Autowired
    private ContractService contractService;

    @Autowired
    private InvoiceService invoiceService;


    @GetMapping("/get-all-contracts")
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
    }


    @GetMapping("/get-billed-per-month-per-contract/{contractId}")
    public Double getBilledPerMonthPerContract(@PathVariable Long contractId) {
        return contractService.getBilledPerMonthPerContract(contractId);
    }

    @GetMapping("/get-contract-with-invoices/{contractId}")
    public ContractDTO getContractWithInvoices(@PathVariable Long contractId) {
        return contractService.getCompleteContracts(contractId);
    }

    @GetMapping("/get-all-orange-flags")
    public Integer getAllExpiredContractCounts() {
        return contractService.getAllExpiredContractCounts() + invoiceService.getAllPastDueInvoicesCounts();
    }

    @PostMapping("/save-contract")
    public Contract saveContract(@RequestBody Contract contract) {
        return contractService.addContract(contract);
    }

}