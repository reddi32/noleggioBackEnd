package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Guidatori {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_guidatori")
	private Integer idGuidatori;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "codice_patente")
	private String codicePatente;
	@Column(name = "data_di_scadenza")
	private Date dataDiScadenza;
	@Column(name = "valida")
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
/*
	@ManyToOne
    @JoinColumn(name = "fk_Utente", referencedColumnName = "id_utente")
	@JsonIgnoreProperties("Utenti")
	
	private Utenti utenti;
	
	public Utenti getUtenti() {
		return utenti;
	}
	public void setUtenti(Utenti utenti) {
		this.utenti=utenti;
	}*/
}
