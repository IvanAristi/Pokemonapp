package com.tutoria.spring.pokemon.crosscutting.client;



import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.tutoria.spring.pokemon.crosscutting.dto.PokemonDto;

import io.netty.resolver.DefaultAddressResolverGroup;
import reactor.netty.http.client.HttpClient;

@Service
public class PokemonApiClient {

	private final WebClient webClient;
	
	
	public PokemonApiClient(WebClient.Builder webClientBuilder) {
		
		var reactorHttpClient = HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);	
		webClient = webClientBuilder
			    .baseUrl("https://pokeapi.co/api/v2/")
			    .clientConnector(new ReactorClientHttpConnector(reactorHttpClient))
			    .build();
	}
	
	public PokemonDto getPokemon(String pokemonName) {
		  return webClient.get()
		      .uri(uriBuilder -> uriBuilder
		          .path("/pokemon/{pokemonName}")
		          .build(pokemonName))
		      .retrieve()
		      .onStatus(HttpStatusCode::isError, ClientResponse::createException)
		      .bodyToMono(PokemonDto.class)
		      .log()
		      .block();
		}
	
	
	
}
