package com.example.zeplin.service;

import com.example.zeplin.dto.ContractDTO;
import com.example.zeplin.model.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> getAllContracts();
    Double getBilledPerMonthPerContract(Long contractId);
    ContractDTO getCompleteContracts(Long id);
    Integer getAllExpiredContractCounts();
    Contract addContract(Contract contract);
}
