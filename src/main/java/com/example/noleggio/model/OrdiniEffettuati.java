package com.example.noleggio.model;

import java.time.LocalDateTime;

public class OrdiniEffettuati {
	
	private Integer idOrdineEffettuato;
	private LocalDateTime dataPrenotazione;
	private LocalDateTime dataInizio;
	private String riepilogo;
	
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
	public String getRiepilogo() {
		return riepilogo;
	}
	public void setRiepilogo(String riepilogo) {
		this.riepilogo = riepilogo;
	}

}
