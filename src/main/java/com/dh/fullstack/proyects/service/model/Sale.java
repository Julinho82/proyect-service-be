package com.dh.fullstack.proyects.service.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sale_table")
public class Sale {

    @Id
    @Column(name = "saleid", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="number_sale", nullable = false)
    private Long numberSale;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdDate", nullable = false, updatable = false)
    private Date createdDate;


    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "salesemployeid",referencedColumnName = "personid")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "salesclient",referencedColumnName = "personid")
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberSale() {
        return numberSale;
    }

    public void setNumberSale(Long numberSale) {
        this.numberSale = numberSale;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
