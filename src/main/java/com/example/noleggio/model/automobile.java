package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class automobile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idAuto;
	private Date annoDiImmatricolazione;
	private Float chilometraggio;
	private String targa;
	private Integer Modelli_idModello;
	
	public Integer getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(Integer idAuto) {
		this.idAuto = idAuto;
	}
	public Date getAnnoDiImmatricolazione() {
		return annoDiImmatricolazione;
	}
	public void setAnnoDiImmatricolazione(Date annoDiImmatricolazione) {
		this.annoDiImmatricolazione = annoDiImmatricolazione;
	}
	public Float getChilometraggio() {
		return chilometraggio;
	}
	public void setChilometraggio(Float chilometraggio) {
		this.chilometraggio = chilometraggio;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Integer getModelli_idModello() {
		return Modelli_idModello;
	}
	public void setModelli_idModello(Integer modelli_idModello) {
		Modelli_idModello = modelli_idModello;
	}
	
	/*
	@JoinColumn(name = "fk_Costo", referencedTable = "Modelli")
		@JsonIgnoreProperties("idModello")*/
	
}
