package com.kaizen.gymauth.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="schedules")
public class Schedule implements Serializable {

    private Long id;
    private String description;
    private String day;
    private Date checkIn;
    private Date checkOut;
    private int userId;
    
    public Schedule() {
        
    }
    
    public Schedule(String description, String day, Date checkIn, Date checkOut, int userId) {
        this.description = description;
        this.day = day;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
    
    @Column(name="day", nullable=false, length=191)
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="checkIn", nullable=false, length=8)
    public Date getCheckIn() {
        return this.checkIn;
    }
    
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="checkOut", nullable=false, length=8)
    public Date getCheckOut() {
        return this.checkOut;
    }
    
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    
    @Column(name="userId", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
