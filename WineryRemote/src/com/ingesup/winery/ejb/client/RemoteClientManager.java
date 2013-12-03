package com.ingesup.winery.ejb.client;

import javax.ejb.Remote;

import com.ingesup.winery.entity.Client;

@Remote
public interface RemoteClientManager {

    public static final String JNDI_NAME = "ejb/client";
    
    public abstract Client save(Client client);

    public abstract void delete(Client client);

    public abstract Client getById(Long id);
    
    public abstract Client isIdentificationOk(String login, String password);

}