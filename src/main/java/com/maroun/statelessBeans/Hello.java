package com.maroun.statelessBeans;

import javax.ejb.Remote;

@Remote
public interface Hello {
    public String sayHello();
}
