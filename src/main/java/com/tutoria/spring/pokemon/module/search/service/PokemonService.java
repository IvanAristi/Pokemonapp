package com.tutoria.spring.pokemon.module.search.service;

import com.tutoria.spring.pokemon.crosscutting.dto.Ability;
import com.tutoria.spring.pokemon.crosscutting.dto.AbilityGeneral;
import org.springframework.stereotype.Service;

import com.tutoria.spring.pokemon.crosscutting.client.PokemonApiClient;
import com.tutoria.spring.pokemon.crosscutting.dto.PokemonDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
	
	private PokemonApiClient  pokemonApiClient;
	
	public PokemonService (PokemonApiClient pokemonApiClient) {
		this.pokemonApiClient= pokemonApiClient;
	}


	// Metodo principal para obtener el Pokémon y actualizar las habilidades
	public PokemonDto getPokemon(String pokemonName) {
		PokemonDto pokemon = pokemonApiClient.getPokemon(pokemonName);

		for (int i = 0;  i < pokemon.getAbilities().size(); i++) {
			Ability ability = pokemon.getAbilities().get(i).getAbility();
			ability.setId(extractAbilityId(ability.getUrl()));
		}
		return pokemon;
	}


	// Extrae el ID desde la URL de la habilidad
	private String extractAbilityId(String url) {
		String[] idStr = url.split("/");
		return idStr[idStr.length - 1];
	}

}
