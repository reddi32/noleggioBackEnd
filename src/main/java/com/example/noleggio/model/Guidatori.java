package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guidatori {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idGuidatori;
	private String nome;
	private String cognome;
	private String codicePatente;
	private Date dataDiScadenza;
	private Boolean valida;
	
	public Integer getIdGuidatori() {
		return idGuidatori;
	}
	public void setIdGuidatori(Integer idGuidatori) {
		this.idGuidatori = idGuidatori;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodicePatente() {
		return codicePatente;
	}
	public void setCodicePatente(String codicePatente) {
		this.codicePatente = codicePatente;
	}
	public Date getDataDiScadenza() {
		return dataDiScadenza;
	}
	public void setDataDiScadenza(Date dataDiScadenza) {
		this.dataDiScadenza = dataDiScadenza;
	}
	public Boolean getValida() {
		return valida;
	}
	public void setValida(Boolean valida) {
		this.valida = valida;
	}

}
