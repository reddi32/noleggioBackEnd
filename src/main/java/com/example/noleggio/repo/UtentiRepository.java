package com.example.noleggio.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.noleggio.model.utenti;

public interface UtentiRepository extends CrudRepository<utenti, Integer> {
	
	//Optional<utenti> findById(Integer idUtente);
	//Optional<utenti> findByNome(String nome);

}
