package com.kaizen.gymauth.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_types")
public class PaymentType implements Serializable {
    
    private Long id;
    private String description;
    private int days;
    
    public PaymentType() {
        
    }
    
    public PaymentType(String description, int days) {
        this.description = description;
        this.days = days;
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
    
    @Column(name="days", nullable=false)
    public int getDays() {
        return this.days;
    }
    
    public void setDays(int days) {
        this.days = days;
    }

}
