/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author kapaggar
 */
@Entity
public class Account  implements Serializable {
    @Id
    private int accNo;
    private Customer customer;
    private String accType;
    private String IFSC;
    private String tranPassword;
    private Date dateOfCreation;
    private Double transferLimit;
    private int minBal;

    public Account(int accNo, Customer customer, String accType, String IFSC, String tranPassword, Date dateOfCreation, Double transferLimit, int minBal) {
        this.accNo = accNo;
        this.customer = customer;
        this.accType = accType;
        this.IFSC = IFSC;
        this.tranPassword = tranPassword;
        this.dateOfCreation = dateOfCreation;
        this.transferLimit = transferLimit;
        this.minBal = minBal;
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
