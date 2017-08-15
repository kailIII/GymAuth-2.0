package com.kaizen.gymauth.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salaries")
public class Salary implements Serializable {
    
    private Long id;
    private String description;
    private double amount;
    private int salaryTypeId;
    private int userId;
    
    public Salary() {
        
    }
    
    public Salary(String description, double amount, int salaryTypeId, int userId) {
        this.description = description;
        this.amount = amount;
        this.salaryTypeId = salaryTypeId;
        this.userId = userId;
    }
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="description", nullable=false, length=191)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="amount", nullable=false, precision=22, scale=0)
    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Column(name="salaryTypeId", nullable=false)
    public int getSalaryTypeId() {
        return this.salaryTypeId;
    }
    
    public void setSalaryTypeId(int salaryTypeId) {
        this.salaryTypeId = salaryTypeId;
    }
    
    @Column(name="userId", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
