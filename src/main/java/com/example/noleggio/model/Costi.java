package com.example.noleggio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Costi {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idCosto")
	private Integer idCosto;
	@Column(name = "tiplogiaPrezzo")
	private String tipologiaPrezzo; //settimanale, mensile, annuale
	@Column(name = "prezzo")
	private Float prezzo;
	
	public Integer getIdCosto() {
		return idCosto;
	}
	public void setIdCosto(Integer idCosto) {
		this.idCosto = idCosto;
	}
	public String getTipologiaPrezzo() {
		return tipologiaPrezzo;
	}
	public void setTipologiaPrezzo(String tipologiaPrezzo) {
		this.tipologiaPrezzo = tipologiaPrezzo;
	}
	public Float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	
	@ManyToOne
    @JoinColumn(name = "fk_Modello", referencedColumnName = "idModello")
	@JsonIgnoreProperties("Modelli")
	
	private Modelli modelli;
	
	public Modelli getmodelli() {
		return modelli;
	}
	public void setModelli(Modelli modelli) {
		this.modelli=modelli;
	}
}
