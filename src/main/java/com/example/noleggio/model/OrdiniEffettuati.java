package com.example.noleggio.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class OrdiniEffettuati {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idOrdineEffettuato;
	private LocalDateTime dataPrenotazione;
	private LocalDateTime dataInizio;
	private LocalDateTime dataFine;
	private String riepilogo;
	
	public OrdiniEffettuati() {}
	
	public OrdiniEffettuati (Integer idOrdineEffettuato, LocalDateTime dataPrenotazione, LocalDateTime dataInizio, LocalDateTime dataFine, String riepilogo) {
		this.idOrdineEffettuato = idOrdineEffettuato;
		this.dataPrenotazione = dataPrenotazione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.riepilogo = riepilogo;
	}
	
	public Integer getIdOrdineEffettuato() {
		return idOrdineEffettuato;
	}
	public void setIdOrdineEffettuato(Integer idOrdineEffettuato) {
		this.idOrdineEffettuato = idOrdineEffettuato;
	}
	public LocalDateTime getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(LocalDateTime dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public LocalDateTime getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDateTime dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDateTime getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDateTime dataFine) {
		this.dataFine = dataFine;
	}
	public String getRiepilogo() {
		return riepilogo;
	}
	public void setRiepilogo(String riepilogo) {
		this.riepilogo = riepilogo;
	}
	/*
	@ManyToOne
    @JoinColumn(name = "fk_id_utente", referencedColumnName = "id_utente")
    @JsonIgnoreProperties("ordineEffettuato")
	
	private Utenti utenti;
	
	public Utenti getUtenti() {
		return utenti;
	}
	
	public void setUtenti(Utenti utenti) {
		this.utenti=utenti;
	}
	
	@OneToMany( mappedBy = "ordineEffettuato" )
    @JsonIgnoreProperties("ordineEffettuato")
	
	private List<UtenteRegistrato> utentiRegistrati;
		
	public List<UtenteRegistrato> getUtentiInvitati() {
		return utentiRegistrati;
	}
	public void setUtentiInvitati(List<UtenteRegistrato> utentiRegistrati) {
		this.utentiRegistrati=utentiRegistrati;
	}
*/
}
