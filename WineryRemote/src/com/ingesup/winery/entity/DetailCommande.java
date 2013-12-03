package com.ingesup.winery.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "tp", name = "detail_commande")
public class DetailCommande implements Serializable {
    
    private static final long serialVersionUID = 7290337291754352601L;
    
    public DetailCommande() {
	super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_detail_commande")
    @SequenceGenerator(name = "s_detail_commande", sequenceName = "tp.seq_detail_commande", allocationSize = 1)
    @Column(name = "detail_commande_id")
    private Long id;
    
    @OneToOne(cascade = CascadeType.REMOVE, targetEntity = Commande.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_commande", referencedColumnName = "commande_id")
    private Commande commande;
    
    @OneToOne(cascade = CascadeType.REMOVE, targetEntity = Produit.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_produit", referencedColumnName = "produit_id")
    private Produit produit;
    
    @Column
    private Long quantite;
    @Column
    private Float prixJour;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Commande getCommande() {
	return commande;
    }

    public void setCommande(Commande commande) {
	this.commande = commande;
    }

    public Produit getProduit() {
	return produit;
    }

    public void setProduit(Produit produit) {
	this.produit = produit;
    }

    public Long getQuantite() {
	return quantite;
    }

    public void setQuantite(Long quantite) {
	this.quantite = quantite;
    }

    public Float getPrixJour() {
	return prixJour;
    }

    public void setPrixJour(Float prixJour) {
	this.prixJour = prixJour;
    }

}
