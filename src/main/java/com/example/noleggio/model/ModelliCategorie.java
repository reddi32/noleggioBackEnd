package com.example.noleggio.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ModelliCategorie {


	@ManyToOne
    @JoinColumn(name = "fk_Modello2", referencedColumnName = "idModello")
	@JsonIgnoreProperties("Modelli")
	
	private Modelli modelli;
	
	public Modelli getModelli() {
		return modelli;
	}
	public void setModelli(Modelli modelli) {
		this.modelli=modelli;
	}
	/*
	@ManyToOne
    @JoinColumn(name = "fk_Categoria", referencedColumnName = "idCategorie")
	@JsonIgnoreProperties("Categorie")
	
	private Categorie categorie;
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie=categorie;
	}*/
}
