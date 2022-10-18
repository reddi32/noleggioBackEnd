package com.example.noleggio.model;

import javax.persistence.Entity;

@Entity
public class Errore {
	
	String error;
	
	public Errore(String error) {
		this.error=error;
	}
	
	public Errore() {}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	
}