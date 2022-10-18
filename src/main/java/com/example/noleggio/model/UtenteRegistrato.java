package com.example.noleggio.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UtenteRegistrato {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idUtente")
	private Integer idUtente;
	@Column(name = "codiceFiscale")
	private String codiceFiscale;
	
	public UtenteRegistrato() {}
	
	public UtenteRegistrato(Integer idUtente, String codiceFiscale) {
		this.idUtente = idUtente;
		this.codiceFiscale = codiceFiscale;
	}

	public Integer getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	@ManyToOne
    @JoinColumn(name = "fk_ordine_effettuato", referencedColumnName = "idOrdineEffettuato")
	@JsonIgnoreProperties("utenteRegistrato")
	
	private OrdiniEffettuati ordiniEffettuati;
	
	public OrdiniEffettuati getOrdiniEffettuati() {
		return ordiniEffettuati;
	}
	public void setPrenotazioneEffettuata(OrdiniEffettuati ordiniEffettuati) {
		this.ordiniEffettuati=ordiniEffettuati;
	}
}
