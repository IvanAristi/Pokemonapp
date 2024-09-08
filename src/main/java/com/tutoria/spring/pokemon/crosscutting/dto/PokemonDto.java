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
        @JsonProperty("is_hidden") boolean isHidden,
        @JsonProperty("slot") Long slot
    ) {}

    public record Ability(
        @JsonProperty("name") String name,
        @JsonProperty("url") String url
    ) {}

    public record PokemonSprites(
        @JsonProperty("other") Other other,
        @JsonProperty("types") Type[] types
    ) {}

    public record Other(
        @JsonProperty("dream_world") DreamWorld dreamWorld,
        @JsonProperty("home") Home home,
        @JsonProperty("official-artwork") OfficialArtwork officialArtwork
    ) {}

    public record DreamWorld(
        @JsonProperty("front_default") String frontDefault,
        @JsonProperty("front_female") String frontFemale
    ) {}

    public record Home(
        @JsonProperty("front_default") String frontDefault,
        @JsonProperty("front_female") String frontFemale,
        @JsonProperty("front_shiny") String frontShiny,
        @JsonProperty("front_shiny_female") String frontShinyFemale
    ) {}

    public record OfficialArtwork(
        @JsonProperty("front_default") String frontDefault,
        @JsonProperty("front_shiny") String frontShiny
    ) {}

    public record Type(
        @JsonProperty("slot") int slot,
        @JsonProperty("type") TypeDetail type
    ) {}

    public record TypeDetail(
        @JsonProperty("name") String name,
        @JsonProperty("url") String url
    ) {}
}
