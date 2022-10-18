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
public class PrenotazioniAuto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idPrenotazioneAuto")
	private Integer idPrenotazioneAuto;
	@Column(name = "nomeGuidatore")
	private String nomeGuidatore;
	@Column(name = "numeroTarga")
	private String numeroTarga;
	@Column(name = "inizioPrenotazione")
	private Date inizioPrenotazione;
	@Column(name = "finePrenotazione")
	private Date finePrenotazione;
	
	public Integer getIdPrenotazioneAuto() {
		return idPrenotazioneAuto;
	}
	public void setIdPrenotazioneAuto(Integer idPrenotazioneAuto) {
		this.idPrenotazioneAuto = idPrenotazioneAuto;
	}
	public String getNomeGuidatore() {
		return nomeGuidatore;
	}
	public void setNomeGuidatore(String nomeGuidatore) {
		this.nomeGuidatore = nomeGuidatore;
	}
	public String getNumeroTarga() {
		return numeroTarga;
	}
	public void setNumeroTarga(String numeroTarga) {
		this.numeroTarga = numeroTarga;
	}
	public Date getInizioPrenotazione() {
		return inizioPrenotazione;
	}
	public void setInizioPrenotazione(Date inizioPrenotazione) {
		this.inizioPrenotazione = inizioPrenotazione;
	}
	public Date getFinePrenotazione() {
		return finePrenotazione;
	}
	public void setFinePrenotazione(Date finePrenotazione) {
		this.finePrenotazione = finePrenotazione;
	}
	/*
	@ManyToOne
    @JoinColumn(name = "fk_PrenotazioneAuto", referencedColumnName = "idAuto")
	@JsonIgnoreProperties("Automobile")
	
	private Automobile automobile;
	
	public Automobile getAutomobile() {
		return automobile;
	}
	public void setAutomobile(Automobile automobile) {
		this.automobile=automobile;
	}
	
	@ManyToOne
    @JoinColumn(name = "fk_PrenotazioneAuto_1", referencedColumnName = "idOrdineEffettuato")
	@JsonIgnoreProperties("OrdiniEffettuati")
	
	private OrdiniEffettuati ordiniEffettuati;
	
	public OrdiniEffettuati getOrdiniEffettuati() {
		return ordiniEffettuati;
	}
	public void setOrdiniEffettuati(OrdiniEffettuati ordiniEffettuati) {
		this.ordiniEffettuati=ordiniEffettuati;
	}*/
}
