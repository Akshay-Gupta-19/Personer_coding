package com.oracle.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName = "greet")
public class GreetingFacadBeanRemoteImpl implements GreetingFacadRemote{

    @Override
    public String sayHello(String s) {
        System.out.println("Server runs");
        return "Hi "+s+" Greetings";
    }
    
}
