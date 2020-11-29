package com.oracle.bankEjb;


import com.oracle.entity.*;
import javax.ejb.Remote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akggupta
 */
@Remote
public interface BankFacadRemote {
   void addAccount(Account ac);
   void addAddress(Address ad);
   void addBank(Bank ba);
   void addCustomer(Customer cu,int addId);
   void addPassword(Password pw);
   void addServiceType(ServiceType st);
   void addTransaction(Transaction ts);
   void addTransactionType(TransactionType tt);
   
   Account getAccount(int acn);
   Address getAddress(int adn);
   Bank getBank(int bn);
   Customer getCustomer(int cn);
   Password getPassword(int pn);
   ServiceType getServiceType(int sn);
   Transaction getTransaction(int tn);
   TransactionType getTransactionType(int ttn);
   
   
}
