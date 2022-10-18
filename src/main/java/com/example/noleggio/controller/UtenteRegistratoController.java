package com.example.noleggio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.noleggio.model.UtenteRegistrato;
import com.example.noleggio.repo.UtenteRegistratoRepository;

@Controller
@RequestMapping(path="/UtenteRegistrato")
public class UtenteRegistratoController {
	@Autowired
	private UtenteRegistratoRepository utenteRegistratoRepository;
	
	@CrossOrigin(origins ="*")
	@GetMapping("/getUtenteRegistrato/{id}")
	 public @ResponseBody Iterable<UtenteRegistrato> getUtenteRegistrato() {
	    // This returns a JSON or XML with the users
		  return utenteRegistratoRepository.findAll();
 }
}
