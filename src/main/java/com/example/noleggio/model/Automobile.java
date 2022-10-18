package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Automobile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idAuto")
	private Integer idAuto;
	@Column(name = "annoDiImmatricolazione")
	private Date annoDiImmatricolazione;
	@Column(name = "chilometraggio")
	private Float chilometraggio;
	@Column(name = "targa")
	private String targa;
	@Column(name = "Modelli_idModello")
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
	
	@ManyToOne
	@JoinColumn(name = "fk_Costo", referencedColumnName = "Modelli")
		@JsonIgnoreProperties("idModello")
	
	private Modelli modelli;
	
	public Modelli getModelli() {
		return modelli;
	}
	public void setModelli(Modelli modelli) {
		this.modelli = modelli;
	}
	
}
