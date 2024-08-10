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

	
	
	@Autowired
	PokemonService pokemonservice;
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonAppApplication.class, args);
		
		
		
		
	}


	
	@GetMapping("/pokemon/{nombrePokemon}")
	public PokemonDto  obtenerPokemon (@PathVariable ("nombrePokemon") String nombre ) {
		
		
		
		return pokemonservice.getPokemon("pikachu");
		
		
	}
	
	@GetMapping("/pokemon")
	public String filtrarPokemon (@RequestParam ( value="habilidad",required = false ) String habilidad ,
			@RequestParam (value="ubicacion",required = false) String ubicacion) {
		return "Hola soy el pokemon filtrado " + habilidad + " ubicacion = " + ubicacion;
	}
	
	
	//filtros retornar el nombre y edad ubicacion
	///pokemon/{nombrePokem}?edad=5//
	
	
	@GetMapping("/filtrar")
	public String filtrarNombrePokemon (@RequestParam ( value = "nombre", required = false) String nombre,
			  @RequestParam(value = "ubicacion", required = false) String ubicacion,
			  @RequestParam(value = "edad", required = false) Integer edad) {
		return "Nombre del pokemon: " + (nombre != null ? nombre : "no especificado") +
				", Ubicación: " + (ubicacion != null ? ubicacion : "no especificada") +
				", Edad: " + (edad != null ? edad : "no especificada");
				}
					
				}

			
	
	

