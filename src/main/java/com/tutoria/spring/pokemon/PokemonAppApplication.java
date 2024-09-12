package com.tutoria.spring.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tutoria.spring.pokemon.crosscutting.dto.PokemonDto;
import com.tutoria.spring.pokemon.module.search.service.PokemonService;


@RestController
@SpringBootApplication
public class PokemonAppApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonAppApplication.class, args);
		
		
		
		
	}


}


			
	
	

