package com.example.noleggio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Modelli {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idModello")
	private Integer idModello;
	@Column(name = "classeEmissioni")
	private String classeEmissioni;
	@Column(name = "nome")
	private String nome;
	@Column(name = "potenzaMotore")
	private Integer potenzaMotore;
	@Column(name = "numeroPorte")
	private Integer numeroPorte;
	@Column(name = "tipoDiAlimentazione")
	private String tipoDiAlimentazione;
	@Column(name = "tipoDiCambio")
	private String tipoDiCambio;
	@Column(name = "colore")
	private String colore;
	
	public Integer getIdModello() {
		return idModello;
	}
	public void setIdModello(Integer idModello) {
		this.idModello = idModello;
	}
	public String getClasseEmissioni() {
		return classeEmissioni;
	}
	public void setClasseEmissioni(String classeEmissioni) {
		this.classeEmissioni = classeEmissioni;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPotenzaMotore() {
		return potenzaMotore;
	}
	public void setPotenzaMotore(Integer potenzaMotore) {
		this.potenzaMotore = potenzaMotore;
	}
	public Integer getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	public String getTipoDiAlimentazione() {
		return tipoDiAlimentazione;
	}
	public void setTipoDiAlimentazione(String tipoDiAlimentazione) {
		this.tipoDiAlimentazione = tipoDiAlimentazione;
	}
	public String getTipoDiCambio() {
		return tipoDiCambio;
	}
	public void setTipoDiCambio(String tipoDiCambio) {
		this.tipoDiCambio = tipoDiCambio;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	

	@ManyToOne
    @JoinColumn(name = "fk_Marca", referencedColumnName = "idMarca")
	@JsonIgnoreProperties("Marca")
	
	private Marche marche;
	
	public Marche getMarche() {
		return marche;
	}
	public void setMarche(Marche marche) {
		this.marche=marche;
	}
}
