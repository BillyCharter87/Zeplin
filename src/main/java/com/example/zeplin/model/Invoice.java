package com.example.zeplin.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private Long id;

    @Column(name = "past_due")
    private boolean pastDue;

    @Column(name = "amount_paid")
    private double amountPaid;

    @Column(name = "amount_due")
    private double amountDue;

    @Column(name = "contract_id")
    private Long contractId;


    public boolean isPastDue() {
        return pastDue;
    }

    public void setPastDue(boolean pastDue) {
        this.pastDue = pastDue;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
}
