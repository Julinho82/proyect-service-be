package com.dh.fullstack.proyects.service.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name="employeeid",referencedColumnName = "personid")})
public class Employee extends Person {

    @Column(name ="user_id",nullable = false)
    private Long userId;

    @Column(name = "position", length = 50, nullable = false)
    private String position;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
