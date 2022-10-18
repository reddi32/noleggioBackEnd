package com.example.noleggio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marche {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idMarca")
	private Integer idMarca;
	@Column(name = "nome")
	private String nome;
	@Column(name = "nazionalita")
	private String nazionalita;
	
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

}
