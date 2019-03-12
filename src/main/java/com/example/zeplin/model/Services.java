package com.example.zeplin.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Services {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private Long id;

    @Column(name = "site")
    private String site;

    @Column(name = "service")
    private String service;

    @Column(name = "monthlyPrice")
    private double monthlyPrice;

    @Column(name = "contract_id")
    private Long contractId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
}
