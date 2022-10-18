package com.example.noleggio.model;


import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
public class DataAutomobile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_auto_data_disponibile")
	private long idDataAutomobile;
	
	@Column(name = "costo_auto")
	private double costoAuto;
	
	//fk_data_disponibile
	//fk_automobile
	
	
	
	
	public DataAutomobile() {}

	public DataAutomobile(long idDataAutomobile, double costoAuto) {
		super();
		this.idDataAutomobile = idDataAutomobile;
		this.costoAuto = costoAuto;
	}

	public long getIdDataAutomobile() {
		return idDataAutomobile;
	}

	public void setIdDataAutomobile(long idDataAutomobile) {
		this.idDataAutomobile = idDataAutomobile;
	}

	public double getcostoAuto() {
		return costoAuto;
	}

	public void setcostoAuto(double costoAuto) {
		this.costoAuto = costoAuto;
	}

	@Override
	public String toString() {
		return "DataAutomobile [idDataAutomobile=" + idDataAutomobile + ", costoAuto=" + costoAuto
				+ "]";
	}
	
	@ManyToOne
    @JoinColumn(name = "fk_automobile", referencedColumnName = "id_automobile")
    @JsonIgnoreProperties("dataAutomobili")
	
	private Automobile automobile;
	
	public Automobile getAutomobile() {
		return automobile;
	}
	public void setAutomobile(Automobile automobile) {
		this.automobile=automobile;
	}
	
	
	@ManyToOne
    @JoinColumn(name = "fk_data_disponibile", referencedColumnName = "id_data_disponibile")
    @JsonIgnoreProperties("dataAutomobili")
	
	private DataDisponibile dataDisponibile;
	
	public DataDisponibile getDataDisponibile() {
		return dataDisponibile;
	}
	public void setDataDisponibile(DataDisponibile dataDisponibile) {
		this.dataDisponibile=dataDisponibile;
	}
	
	/*
	@OneToMany( mappedBy = "autoDataDisponibile")
    @JsonIgnoreProperties("autoDataDisponibile")
	
	private List<PrenotazioneEffettuata> prenotazioniEffettuate;
		
	public List<PrenotazioneEffettuata> getPrenotazioniEffettuate() {
		return prenotazioniEffettuate;
	}
	public void setPrenotazioniEffettuate(List<PrenotazioneEffettuata> prenotazioniEffettuate) {
		this.prenotazioniEffettuate=prenotazioniEffettuate;
	}
	
	
	
	@OneToMany( mappedBy = "settoreDataEvento")
    @JsonIgnoreProperties("settoreDataEvento")
	
	private List<Prenotazione> prenotazioni;
		
	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni=prenotazioni;
	}
*/
}
