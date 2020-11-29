package ejbgreetingclient2;

import com.oracle.ejb.GreetingFacadRemote;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBGreetingClient2 {
    public static void main(String[] args) throws NamingException {
            System.out.println("Simple Java Client");
            Hashtable<String,String> map=new Hashtable();
            map.put(Context.PROVIDER_URL,"t3://localhost:7001");
            map.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
            Context ctx=new InitialContext(map);
        GreetingFacadRemote lookup = (GreetingFacadRemote) ctx.lookup("greet#com.oracle.ejb.GreetingFacadRemote");
            System.out.println("Look up success;");
            System.out.println("Calling remote method");
            System.out.println(lookup.sayHello("Akshay"));
    }
    
}
