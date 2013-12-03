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

@Entity(name = "client")
@Table(schema = "tp", name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = -8258241552389801202L;
    
    public Client() {
	super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_client")
    @SequenceGenerator(name = "s_client", sequenceName = "seq_client", allocationSize = 1)
    @Column(name = "client_id")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_client", referencedColumnName = "client_id")
    private List<Commande> commande;

    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String mail;
    @Column
    private String adresse;
    @Column
    private String login;
    @Column
    private String password;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getPrenom() {
	return prenom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public String getMail() {
	return mail;
    }

    public void setMail(String mail) {
	this.mail = mail;
    }

    public String getAdresse() {
	return adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public List<Commande> getCommande() {
	return commande;
    }

    public void setCommande(List<Commande> commande) {
	this.commande = commande;
    }

}
