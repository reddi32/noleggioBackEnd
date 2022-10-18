package com.example.noleggio.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.noleggio.model.Automobile;


public interface AutomobileRepository extends CrudRepository<Automobile, Integer> {

}
