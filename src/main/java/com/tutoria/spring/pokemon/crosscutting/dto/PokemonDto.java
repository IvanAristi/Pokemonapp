package com.tutoria.spring.pokemon.crosscutting.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PokemonDto(
		    Long height,
		    String name,
		    Long id,
		    Long order,
		    Long weight,
		    List<AbilityGeneral> abilities,
		    PokemonSprites sprites
		    
		   
		) {
		 
		public record AbilityGeneral(
		    Ability ability,
		 
//		    @JsonProperty("is_hidden")
		    boolean isHidden,
		    Long slot
		    
		)
		{}
		 
		public record Ability(
		    String name,
		    String url
		){}
		
		
		
		

		public record PokemonSprites(
			    Other other,
			    Type[] types
			) {}

			public record Other(
			    DreamWorld dreamWorld,
			    Home home,
			    OfficialArtwork official_artwork
			) {}

			public record DreamWorld(
			    String front_default,
			    String front_female
			) {}

			public record Home(
			    String front_default,
			    String front_female,
			    String front_shiny,
			    String front_shiny_female
			) {}

			public record OfficialArtwork(
			    String front_default,
			    String front_shiny
			) {}

			public record Type(
			    int slot,
			    TypeDetail type
			) {}

			public record TypeDetail(
			    String name,
			    String url
			) {}
		
}
