package com.example.noleggio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class UtentiLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	
	public UtentiLogin() {}
	public UtentiLogin(String email, String password) {
		this.email=email;
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UtenteLogin [email=" + email + ", password=" + password + "]";
	}
}
