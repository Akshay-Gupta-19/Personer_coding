/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank implements Serializable {
    @Id
    private int bankId;
    private String bankName;
    private String IFSC;
    private String branchName;
    private long customerCount;
    
    @OneToMany(mappedBy = "bank")
    List<Customer> customers;

    @Override
    public String toString() {
        return "Bank{" + "bankId=" + bankId + ", bankName=" + bankName + ", IFSC=" + IFSC + ", branchName=" + branchName + ", customerCount=" + customerCount + ", customers=" + customers + '}';
    }

    public Bank() {
    }
    public Bank(int bankId, String bankName, String IFSC, String branchName, long customerCount) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.IFSC = IFSC;
        this.branchName = branchName;
        this.customerCount = customerCount;
        this.customers = new ArrayList<Customer>();
    }


    
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public long getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(long customerCount) {
        this.customerCount = customerCount;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
