package com.example.noleggio.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class PrenotazioniAutoGuidatori {

	@ManyToOne
    @JoinColumn(name = "fk_PrenotazioniAutoGuidatori", referencedColumnName = "idPrenotazioneAuto")
	@JsonIgnoreProperties("PrenotazioniAuto")
	
	private PrenotazioniAuto prenotazioniAuto;
	
	public PrenotazioniAuto getPrenotazioniAuto() {
		return prenotazioniAuto;
	}
	public void setPrenotazioniAuto(PrenotazioniAuto prenotazioniAuto) {
		this.prenotazioniAuto=prenotazioniAuto;
	}
	
	@ManyToOne
    @JoinColumn(name = "fk_PrenotazioneAutoGuidatori_1", referencedColumnName = "idGuidatore")
	@JsonIgnoreProperties("Guidatori")
	
	private Guidatori guidatori;
	
	public Guidatori getGuidatori() {
		return guidatori;
	}
	public void setGuidatori(Guidatori guidatori) {
		this.guidatori=guidatori;
	}
}
