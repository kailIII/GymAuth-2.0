package com.kaizen.gymauth.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames="email"))
public class User implements Serializable {
    
    private Long id;
    private String email;
    private String password;
    private byte[] fingerprint;
    private UserDetail userDetail;
    
    public User() {
        
    }
    
    public User(String email, String password, UserDetail userDetail) {
        this.email = email;
        this.password = password;
        this.userDetail = userDetail;
    }
    public User(String email, String password, byte[] fingerprint, UserDetail userDetail) {
        this.email = email;
        this.password = password;
        this.fingerprint = fingerprint;
        this.userDetail = userDetail;
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
    
    @Column(name="email", unique=true, nullable=false, length=191)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="password", nullable=false, length=191)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="fingerprint")
    public byte[] getFingerprint() {
        return this.fingerprint;
    }
    
    public void setFingerprint(byte[] fingerprint) {
        this.fingerprint = fingerprint;
    }
    
    @OneToOne
    @Column(name="userDetailId", nullable=false)
    public UserDetail getUserDetail() {
        return this.userDetail;
    }
    
    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
    
}
