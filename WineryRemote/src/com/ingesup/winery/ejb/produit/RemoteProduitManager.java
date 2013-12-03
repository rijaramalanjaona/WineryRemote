package com.ingesup.winery.ejb.produit;

import java.util.List;

import javax.ejb.Remote;

import com.ingesup.winery.entity.Produit;

@Remote
public interface RemoteProduitManager {

    public static final String JNDI_NAME = "ejb/produit";

    public abstract Produit save(Produit produit);

    public abstract void delete(Produit produit);

    public abstract Produit getById(Long id);
    
    public abstract List<Produit> getAll();
    
    public abstract Produit update(Produit produit);

}