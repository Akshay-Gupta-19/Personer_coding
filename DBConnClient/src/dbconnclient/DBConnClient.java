/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnclient;

import com.oracle.ejb.CustomerFacadRemote;
import com.oracle.entity.Customer;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author akggupta
 */
public class DBConnClient {

   
    public static void main(String[] args) throws NamingException {
            System.out.println("Simple Java Client");
            Hashtable<String,String> map=new Hashtable();
            map.put(Context.PROVIDER_URL,"t3://localhost:7001");
            map.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
            Context ctx=new InitialContext(map);
            CustomerFacadRemote rem=(CustomerFacadRemote) ctx.lookup("Customer#com.oracle.ejb.CustomerFacadRemote");
            Customer c=randCust();
            System.out.println(rem);
           // rem.addCustomer(c);
           System.out.println(rem.readBuId(101));
    }
    static Customer randCust(){
        return new Customer(102, "Naman", "casual", 4583563);    
    }
    
}
