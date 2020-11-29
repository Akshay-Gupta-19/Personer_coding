
package com.oracle.dao;

import com.oracle.entity.Accoutnt;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class LoginDao {
    public Accoutnt login(String uname,String pwd){
        if(uname.equals("Albin") && pwd.equals("123"))
        {
            Accoutnt ac=new Accoutnt();
            ac.setAccNo(436);
            ac.setBankBalance(6892312);
            ac.setName("saitama");
            return ac;
        }
        else
            return null;
    }
}
