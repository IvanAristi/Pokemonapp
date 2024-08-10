package com.tutoria.spring.pokemon.module.search.service;

import org.springframework.stereotype.Service;

import com.tutoria.spring.pokemon.crosscutting.client.PokemonApiClient;
import com.tutoria.spring.pokemon.crosscutting.dto.PokemonDto;

@Service
public class PokemonService {
	
	private PokemonApiClient  pokemonApiClient;
	
	
	public PokemonService (PokemonApiClient pokemonApiClient) {
		this.pokemonApiClient= pokemonApiClient;
		
	}
	
	
	public PokemonDto  getPokemon(String pokemonName) {
		
		return  pokemonApiClient.getPokemon(pokemonName);
		
		
	}
	
}
