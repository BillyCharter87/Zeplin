package com.example.zeplin.service.impl;

import com.example.zeplin.dto.ContractDTO;
import com.example.zeplin.model.Contract;
import com.example.zeplin.model.Invoice;
import com.example.zeplin.model.Services;
import com.example.zeplin.repository.ContractRepository;
import com.example.zeplin.repository.InvoiceRepository;
import com.example.zeplin.repository.ServicesRepository;
import com.example.zeplin.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ContractServiceImpl implements ContractService {


    @Autowired
    ContractRepository contractRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    ServicesRepository servicesRepository;

    @Override
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Double getBilledPerMonthPerContract(Long contractId){
        double total = 0;
        ContractDTO contractDTO = getCompleteContracts(contractId);
        List<Services> services = contractDTO.getServices();
        for (Services s: services) {
            total = s.getMonthlyPrice() + total;
        }
        return total;
    }

    @Override
    public ContractDTO getCompleteContracts(Long id) {
        ContractDTO contractDTO = new ContractDTO();
        List <Services> services = servicesRepository.findAllByContractId(id);
        List <Invoice> invoices = invoiceRepository.findAllByContractId(id);
        Optional<Contract> contract = contractRepository.findById(id);
        contractDTO.setContract(contract.get());
        contractDTO.setInvoice(invoices);
        contractDTO.setServices(services);
        return contractDTO;
    }

    @Override
    public Integer getAllExpiredContractCounts(){
        return contractRepository.countAllByExpirationIsTrue();
    }

    @Override
    public Contract addContract(Contract contract) {
        return contractRepository.save(contract);
    }
}
