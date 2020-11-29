
package com.oracle.bankEjb;

import com.oracle.entity.Account;
import com.oracle.entity.Address;
import com.oracle.entity.Bank;
import com.oracle.entity.Customer;
import com.oracle.entity.Investors;
import com.oracle.entity.Offers;
import com.oracle.entity.Password;
import com.oracle.entity.ServiceType;
import com.oracle.entity.Transaction;
import com.oracle.entity.TransactionType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akggupta
 */
@Stateless(mappedName = "bankEJB")
public class BankFacadRemoteImpl implements BankFacadRemote{
  @PersistenceContext
    private EntityManager emj;
    @Override
    public void addAccount(Account ac) {
        emj.persist(ac);
    }

    @Override
    public void addAddress(Address ad) {
        emj.persist(ad);
    }

    @Override
    public void addBank(Bank ba) {
        emj.persist(ba);
    }

    @Override
    public void addCustomer(Customer cu,int addId) {
      Address add = emj.find(Address.class, addId);
      cu.getAddress().add(add);
      emj.persist(cu);
    }


    @Override
    public void addPassword(Password pw) {
        emj.persist(pw);
    }

    @Override
    public void addServiceType(ServiceType st) {
        emj.persist(st);
    }

    @Override
    public void addTransaction(Transaction ts) {
        emj.persist(ts);
    }

    @Override
    public void addTransactionType(TransactionType tt) {
        emj.persist(tt);
    }

    @Override
    public Account getAccount(int acn) {
        return emj.find(Account.class, acn);
    }

    @Override
    public Address getAddress(int adn) {
        return emj.find(Address.class,adn);
    }

    @Override
    public Bank getBank(int bn) {
        return emj.find(Bank.class, bn);
    }

    @Override
    public Customer getCustomer(int cn) {
        Customer c= emj.find(Customer.class,cn);
        System.out.println("Ok till here ");
        return c;
    }

    @Override
    public Password getPassword(int pn) {
        return emj.find(Password.class,pn);
    }

    @Override
    public ServiceType getServiceType(int sn) {
        return emj.find(ServiceType.class, sn);
    }

    @Override
    public Transaction getTransaction(int tn) {
        return emj.find(Transaction.class, tn);
     }

    @Override
    public TransactionType getTransactionType(int ttn) {
        return emj.find(TransactionType.class,ttn);
    }
    
}
