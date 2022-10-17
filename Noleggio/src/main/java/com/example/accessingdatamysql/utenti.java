package com.example.accessingdatamysql;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class utenti {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer idUtente;
  private String nome;
  private String cognome;
  private String email;
  private String password;
  private Date dataDiNascita;
  private String paeseDiNascita;
  private String partitaIva;
  private Integer azienda;
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

public String getPartitaIva() {
	return partitaIva;
}

public void setPartitaIva(String partitaIva) {
	this.partitaIva = partitaIva;
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