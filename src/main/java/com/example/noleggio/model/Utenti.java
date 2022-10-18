package com.example.noleggio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Utenti {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "idUtente")
  private Integer idUtente;
  @Column(name = "nome")
  private String nome;
  @Column(name = "cognome")
  private String cognome;
  @Column(name = "email")
  private String email;
  @Column(name = "password")
  private String password;
  @Column(name = "dataDiNascita")
  private Date dataDiNascita;
  @Column(name = "paeseDiNascita")
  private String paeseDiNascita;
  @Column(name = "azienda")
  private Integer azienda;
  @Column(name = "codiceFiscale")
  private String codiceFiscale;
  

  public Integer getIdUtente() {
    return idUtente;
  }

  public void setIdUtente(Integer idUtente) {
    this.idUtente = idUtente;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Date getDataDiNascita() {
	return dataDiNascita;
}

public void setDataDiNascita(Date dataDiNascita) {
	this.dataDiNascita = dataDiNascita;
}

public String getPaeseDiNascita() {
	return paeseDiNascita;
}

public void setPaeseDiNascita(String paeseDiNascita) {
	this.paeseDiNascita = paeseDiNascita;
}

public Integer getAzienda() {
	return azienda;
}

public void setAzienda(Integer azienda) {
	this.azienda = azienda;
}

public String getCodiceFiscale() {
	return codiceFiscale;
}

public void setCodiceFiscale(String codiceFiscale) {
	this.codiceFiscale = codiceFiscale;
}
}
