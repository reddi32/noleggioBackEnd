package com.example.noleggio.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.noleggio.model.Utenti;

public interface UtentiRepository extends CrudRepository<Utenti, Integer> {
	
	//Optional<utenti> findById(Integer idUtente);
	//Optional<utenti> findByNome(String nome);

}