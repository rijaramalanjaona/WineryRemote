package com.ingesup.winery.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "tp", name = "commande")
public class Commande implements Serializable {

    private static final long serialVersionUID = -518295445915695774L;

    public Commande() {
	super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_commande")
    @SequenceGenerator(name = "s_commande", sequenceName = "tp.seq_commande", allocationSize = 1)
    @Column(name = "commande_id")
    private Long id;

    @OneToOne(cascade = CascadeType.REMOVE, targetEntity = Client.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_client", referencedColumnName = "client_id")
    private Client client;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_commande", referencedColumnName = "commande_id")
    private List<DetailCommande> detailCommande;

    @Column
    private Date date;
    @Column
    private Float total;
    @Column
    private String etat;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    public Date getDate() {
	return date;
    }

    public void setDate(Date date) {
	this.date = date;
    }

    public Float getTotal() {
	return total;
    }

    public void setTotal(Float total) {
	this.total = total;
    }

    public String getEtat() {
	return etat;
    }

    public void setEtat(String etat) {
	this.etat = etat;
    }

    public List<DetailCommande> getDetailCommande() {
        return detailCommande;
    }

    public void setDetailCommande(List<DetailCommande> detailCommande) {
        this.detailCommande = detailCommande;
    }
    
    
}
