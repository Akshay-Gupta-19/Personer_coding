/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author kapaggar
 */
@Entity
public class Address implements Serializable {
    @Id
    private int addId;
    private String street;
    private  String city;
    private String state;
    private int pinCode;
    @ManyToOne
    private Customer customer;



    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" + "addId=" + addId + ", street=" + street + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", customer=" + customer + '}';
    }

    public Address(int addId, String street, String city, String state, int pinCode) {
        this.addId = addId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
