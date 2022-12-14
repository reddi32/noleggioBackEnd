package com.example.noleggio.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noleggio.model.Utenti;

public interface UtentiRepository extends JpaRepository<Utenti, Integer> {
	
	//Optional<utenti> findById(Integer idUtente);
	Optional<Utenti> findByNome(String nome);

}