package com.example.zeplin.repository;

import com.example.zeplin.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findAllByContractId(Long id);
    Integer countAllByPastDueIsTrue();
}
