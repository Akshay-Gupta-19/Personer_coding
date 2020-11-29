package com.oracle.ejb;

import javax.ejb.Remote;

@Remote
public interface GreetingFacadRemote {
    public String sayHello(String s);
}
