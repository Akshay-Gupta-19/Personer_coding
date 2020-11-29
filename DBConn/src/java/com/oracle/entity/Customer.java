/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author akggupta
 */
@Entity
@Table(name="customer_info")
public class Customer implements Serializable{
    @Id
    int custId;
    public Customer(){};
    public Customer(int custId, String custName, String custType, long phoneNo) {
        this.custId = custId;
        this.custName = custName;
        this.custType = custType;
        this.phoneNo = phoneNo;
    }

    public int getCustId() {
        return custId;
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

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }


    String custName;
    String custType;
    long phoneNo;
}
