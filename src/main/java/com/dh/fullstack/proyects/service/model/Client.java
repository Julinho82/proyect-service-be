package com.dh.fullstack.proyects.service.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="client_table")
@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name="clientid",referencedColumnName = "personid")})
public class Client extends Person {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastPurchase", nullable = false, updatable = false)
    private Date lastPurchase;

    public Date getLastPurchase() {
        return lastPurchase;
    }

    public void setLastPurchase(Date lastPurchase) {
        this.lastPurchase = lastPurchase;
    }
}
