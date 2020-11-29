package com.oracle.ejb;

import com.oracle.entity.Customer;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author akggupta
 */
//test at http://localhost:7001/ws_utc
@Stateless(mappedName = "customer")
@WebService(serviceName = "cser")
public class CustomerFacadRemoteImpl  implements CustomerFacadRemote{
    @PersistenceContext
    private EntityManager emj;
      public void addCustomer(Customer c) {
            emj.persist(c);
    }

    public Customer readBuId(int cid) {
        return emj.find(Customer.class, cid);
    }
    
}
