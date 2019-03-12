package com.example.zeplin.service;

import com.example.zeplin.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getAllContracts();
    Contract addContract(Contract contract);
}
