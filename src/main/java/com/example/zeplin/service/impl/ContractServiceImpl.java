package com.example.zeplin.service.impl;

import com.example.zeplin.model.Contract;
import com.example.zeplin.repository.ContractRepository;
import com.example.zeplin.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContractServiceImpl implements ContractService {


    @Autowired
    ContractRepository contractRepository;

    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contract addContract(Contract contract) {
        return contractRepository.save(contract);
    }
}
