package com.example.noleggio.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.noleggio.model.Automobile;


public interface AutomobileRepository extends JpaRepository<Automobile, Integer> {

}
