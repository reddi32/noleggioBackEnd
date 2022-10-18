package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class PrenotazioniAuto {

	private Integer idPrenotazioneAuto;
	private String nomeGuidatore;
	private String numeroTarga;
	private Date inizioPrenotazione;
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
}
