package com.example.zeplin.controller;

import com.example.zeplin.model.Contract;
import com.example.zeplin.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ContractController {

    @Autowired
    private ContractService contractService;


    @GetMapping("/get-all-contracts")
    public List<Contract> getContract() {
        return contractService.getAllContracts();
    }

    @PostMapping("/save-contract")
    public Contract saveContract(@RequestBody Contract contract) {
        return contractService.addContract(contract);
    }

}