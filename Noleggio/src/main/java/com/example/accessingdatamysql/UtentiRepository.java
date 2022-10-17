package com.example.accessingdatamysql;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UtentiRepository extends CrudRepository<utenti, Integer> {
	
	//Optional<utenti> findById(Integer idUtente);
	//Optional<utenti> findByNome(String nome);

}