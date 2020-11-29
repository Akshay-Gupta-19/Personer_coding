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
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kapaggar
 */
@Entity
public class Customer implements Serializable{
    @Id
    private int custId;
    private String custName;

    @Temporal(TemporalType.DATE)
    private Date DOB;
    private String password;
    @ManyToOne
    private Bank bank;
   
    @OneToMany(mappedBy = "customer")
    private List<Address> address;

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + ", DOB=" + DOB + ", password=" + password + ", bank=" + bank + ", address=" + address + '}';
    }

    public int getCustId() {
        return custId;
    }

    public Customer(int custId, String custName, Date DOB, String password, Bank bank) {
        this.custId = custId;
        this.custName = custName;
        this.DOB = DOB;
        this.password = password;
        this.bank = bank;
        this.address = new ArrayList<Address>();
    }

    public Customer() {
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

 
   
    
}


