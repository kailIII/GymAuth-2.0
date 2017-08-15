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
@Table(name="records")
public class Record implements Serializable {
    
    private Long id;
    private Date checkIn;
    private Date checkOut;
    private int workedHours;
    private int extraHours;
    private int scheduleId;
    private Date date;
    private String observation;
    private String status;
    private String confirmation;
    
    public Record() {
        
    }
    
    public Record(Date checkIn, Date checkOut, int workedHours, int extraHours, int scheduleId, Date date, String observation, String status, String confirmation) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.workedHours = workedHours;
        this.extraHours = extraHours;
        this.scheduleId = scheduleId;
        this.date = date;
        this.observation = observation;
        this.status = status;
        this.confirmation = confirmation;
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
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="checkIn", nullable=false, length=19)
    public Date getCheckIn() {
        return this.checkIn;
    }
    
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="checkOut", nullable=false, length=19)
    public Date getCheckOut() {
        return this.checkOut;
    }
    
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    
    @Column(name="workedHours", nullable=false)
    public int getWorkedHours() {
        return this.workedHours;
    }
    
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
    
    @Column(name="extraHours", nullable=false)
    public int getExtraHours() {
        return this.extraHours;
    }
    
    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    
    @Column(name="scheduleId", nullable=false)
    public int getScheduleId() {
        return this.scheduleId;
    }
    
    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Column(name="observation", nullable=false, length=191)
    public String getObservation() {
        return this.observation;
    }
    
    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    @Column(name="status", nullable=false, length=191)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="confirmation", nullable=false, length=191)
    public String getConfirmation() {
        return this.confirmation;
    }
    
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

}
