



import com.oracle.bankEjb.BankFacadRemote;
import com.oracle.entity.Address;
import com.oracle.entity.Bank;
import com.oracle.entity.Customer;
import java.util.Date;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akggupta
 */
public class Client {
    public static void main(String[] args) throws NamingException {
                    System.out.println("Simple Java Client");
            Hashtable<String,String> map=new Hashtable();
            map.put(Context.PROVIDER_URL,"t3://localhost:7001");
            map.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
            Context ctx=new InitialContext(map);
            BankFacadRemote rem=(BankFacadRemote) ctx.lookup("bankEJB#com.oracle.bankEjb.BankFacadRemote");
          
                Bank b=new Bank(10001, "HDFC","HDFC00001", "Banargatta",0);
           Address ad=new Address(1001, "Powai", "Bombay", "Maharashtra", 400076);
           Customer c=new Customer(1001, "akshay", new Date(1994, 11, 19), "8600", null);
          // new BankDao().addBank(b);
           //System.out.println("Added ..");
           rem.addBank(b);
           rem.addAddress(ad);
           rem.addCustomer(c,1001);
            System.out.println(rem.getBank(10001));
           System.out.println(rem.getCustomer(1001));
           System.out.println(rem.getAddress(1001));
    }
}
