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
public class Automobile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idAuto")
	private Integer idAuto;
	@Column(name = "annoDiImmatricolazione")
	private Integer annoDiImmatricolazione;
	@Column(name = "chilometraggio")
	private Float chilometraggio;
	@Column(name = "targa")
	private String targa;
	
	public Integer getIdAuto() {
		return idAuto;
	}
	public void setIdAuto(Integer idAuto) {
		this.idAuto = idAuto;
	}
	public Integer getAnnoDiImmatricolazione() {
		return annoDiImmatricolazione;
	}
	public void setAnnoDiImmatricolazione(Integer annoDiImmatricolazione) {
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
	
	/*
	@ManyToOne
	@JoinColumn(name = "fk_Costo", referencedColumnName = "id_modello")
		@JsonIgnoreProperties("Modelli")
	
	private Modelli modelli;
	
	public Modelli getModelli() {
		return modelli;
	}
	public void setModelli(Modelli modelli) {
		this.modelli = modelli;
	}*/
	
}
