package com.example.noleggio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.noleggio.model.Modelli;
import com.example.noleggio.repo.ModelliRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path="/modelli") // This means URL's start with /noleggio (after Application path)
public class ModelliController {
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private ModelliRepository modelliRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/getModelli/{id}")
		 public @ResponseBody Iterable<Modelli>/*Optional<utenti>*/ getModelli() {
			    // This returns a JSON or XML with the users
				  return modelliRepository.findAll();
		 }
	
}
