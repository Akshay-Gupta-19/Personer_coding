/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kapaggar
 */
@Entity
public class Password implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",updatable=false,nullable=false)
    private int ID;
    @OneToOne
    private Customer cust;
    @OneToOne
    private Account account;
    private String oldPass;
    private String newPass;

    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;
    private String passType;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfCreationOfTP;

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getOldPass() {
        return oldPass;
    }

    public void setOldPass(String oldPass) {
        this.oldPass = oldPass;
    }

    public String getNewPass() {
        return newPass;
    }

    public void setNewPass(String newPass) {
        this.newPass = newPass;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getPassType() {
        return passType;
    }

    public void setPassType(String passType) {
        this.passType = passType;
    }

    public Date getDateOfCreationOfTP() {
        return dateOfCreationOfTP;
    }

    public void setDateOfCreationOfTP(Date dateOfCreationOfTP) {
        this.dateOfCreationOfTP = dateOfCreationOfTP;
    }
}
