package com.ingesup.winery.ejb.detail;

import java.util.List;

import javax.ejb.Remote;

import com.ingesup.winery.entity.DetailCommande;

@Remote
public interface RemoteDetailCommandeManager {

    public static final String JNDI_NAME = "ejb/detailCommande";
    
    public abstract DetailCommande save(DetailCommande detailCommande);

    public abstract void delete(DetailCommande detailCommande);

    public abstract DetailCommande getById(Long id);
    
    public abstract List<DetailCommande> getByIdCommande(Long idCommande);

}