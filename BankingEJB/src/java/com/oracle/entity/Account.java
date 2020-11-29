/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kapaggar
 */
@Entity
public class Account  implements Serializable {
    @Id
    private int accNo;
    @OneToOne
    private Customer customer;
    private String accType;
    private String IFSC;
    private String tranPassword;
    @Temporal(TemporalType.DATE)
    private Date dateOfCreation;
    private Double transferLimit;
    private int minBal;
    
    
    @OneToMany(mappedBy = "to")
    private List<Transaction> debit;
    @OneToMany(mappedBy="from")
    private List<Transaction> credit;
    
    public Account(int accNo, Customer customer, String accType, String IFSC, String tranPassword, Date dateOfCreation, Double transferLimit, int minBal) {
        this.accNo = accNo;
        this.customer = customer;
        this.accType = accType;
        this.IFSC = IFSC;
        this.tranPassword = tranPassword;
        this.dateOfCreation = dateOfCreation;
        this.transferLimit = transferLimit;
        this.minBal = minBal;
        debit=new ArrayList<Transaction>();
        credit=new ArrayList<Transaction>();
    }

    public Account() {
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getTranPassword() {
        return tranPassword;
    }

    public void setTranPassword(String tranPassword) {
        this.tranPassword = tranPassword;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Double getTransferLimit() {
        return transferLimit;
    }

    public void setTransferLimit(Double transferLimit) {
        this.transferLimit = transferLimit;
    }

    public int getMinBal() {
        return minBal;
    }

    public void setMinBal(int minBal) {
        this.minBal = minBal;
    }
    
    
}
