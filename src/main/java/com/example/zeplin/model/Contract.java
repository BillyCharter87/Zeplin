package com.example.zeplin.model;

import com.example.zeplin.ENUM.ContractType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(generator = "id_gen")
    @GenericGenerator(name="id_gen", strategy = "increment")
    @Column(name="ID")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 30, name = "type")
    private ContractType type;

    @Column(name="start_date")
    private String startDate;

    @Column(name="end_date")
    private String endDate;

    @Column(name="expiration")
    private Boolean expiration;

    public ContractType getType() { return type; }
    public void setType(ContractType type) { this.type = type; }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public Boolean getExpiration() { return expiration; }
    public void setExpiration(Boolean expiration) { this.expiration = expiration; }
}
