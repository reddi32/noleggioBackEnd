package com.example.noleggio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCategorie;
	private String nome;
	
	public Integer getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
