package com.ingesup.winery.ejb.commande;

import java.util.List;

import javax.ejb.Remote;

import com.ingesup.winery.entity.Commande;

@Remote
public interface RemoteCommandeManager {

    public static final String JNDI_NAME = "ejb/commande";
    
    public abstract Commande save(Commande commande);

    public abstract void delete(Commande commande);

    public abstract Commande getById(Long id);
    
    public abstract List<Commande> getByIdClient(Long idClient);
    
    public abstract Commande update(Commande commande);

}