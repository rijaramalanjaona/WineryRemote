package com.ingesup.winery.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "produit")
@Table(schema = "tp", name = "produit")
public class Produit implements Serializable {

    private static final long serialVersionUID = 3468509389843130931L;

    public Produit() {
	super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_produit")
    @SequenceGenerator(name = "s_produit", sequenceName = "seq_produit", allocationSize = 1)
    @Column(name = "produit_id")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_produit", referencedColumnName = "produit_id")
    private List<DetailCommande> detailCommande;

    @Column
    private String cuvee;
    @Column
    private String millesime;
    @Column
    private String producteur;
    @Column
    private String appellation;
    @Column
    private Float prix;
    @Column
    private Long stock;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCuvee() {
	return cuvee;
    }

    public void setCuvee(String cuvee) {
	this.cuvee = cuvee;
    }

    public String getMillesime() {
	return millesime;
    }

    public void setMillesime(String millesime) {
	this.millesime = millesime;
    }

    public String getProducteur() {
	return producteur;
    }

    public void setProducteur(String producteur) {
	this.producteur = producteur;
    }

    public String getAppellation() {
	return appellation;
    }

    public void setAppellation(String appellation) {
	this.appellation = appellation;
    }

    public Float getPrix() {
	return prix;
    }

    public void setPrix(Float prix) {
	this.prix = prix;
    }

    public Long getStock() {
	return stock;
    }

    public void setStock(Long stock) {
	this.stock = stock;
    }

    public List<DetailCommande> getDetailCommande() {
	return detailCommande;
    }

    public void setDetailCommande(List<DetailCommande> detailCommande) {
	this.detailCommande = detailCommande;
    }

}
