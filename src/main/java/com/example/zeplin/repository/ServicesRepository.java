package com.example.zeplin.repository;

import com.example.zeplin.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServicesRepository extends JpaRepository<Services, Long> {
    List<Services> findAllByContractId(Long id);
}
