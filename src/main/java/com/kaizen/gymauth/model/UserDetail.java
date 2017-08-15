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
@Table(name="user_details")
public class UserDetail implements Serializable {
    
    private Long id;
    private String name;
    private Date birthday;
    private String phone;
    private String street;
    private String houseNumber;
    private String colony;
    private String city;
    private Integer monthlyPaymentId;
    private int userTypeId;
    private Integer salaryId;
    
    public UserDetail() {
    }
    
    public UserDetail(String name, int userTypeId) {
        this.name = name;
        this.userTypeId = userTypeId;
    }
    public UserDetail(String name, Date birthday, String phone, String street,
            String houseNumber, String colony, String city,
            Integer monthlyPaymentId, int userTypeId, Integer salaryId) {
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.street = street;
        this.houseNumber = houseNumber;
        this.colony = colony;
        this.city = city;
        this.monthlyPaymentId = monthlyPaymentId;
        this.userTypeId = userTypeId;
        this.salaryId = salaryId;
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
    
    @Column(name="name", nullable=false, length=191)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="birthday", length=10)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="phone", length=191)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="street", length=191)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    @Column(name="houseNumber", length=191)
    public String getHouseNumber() {
        return this.houseNumber;
    }
    
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    @Column(name="colony", length=191)
    public String getColony() {
        return this.colony;
    }
    
    public void setColony(String colony) {
        this.colony = colony;
    }
    
    @Column(name="city", length=191)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="monthlyPaymentId")
    public Integer getMonthlyPaymentId() {
        return this.monthlyPaymentId;
    }
    
    public void setMonthlyPaymentId(Integer monthlyPaymentId) {
        this.monthlyPaymentId = monthlyPaymentId;
    }
    
    @Column(name="userTypeId", nullable=false)
    public int getUserTypeId() {
        return this.userTypeId;
    }
    
    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    
    @Column(name="salaryId")
    public Integer getSalaryId() {
        return this.salaryId;
    }
    
    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }
    
}
