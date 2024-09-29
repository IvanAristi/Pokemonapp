package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonSprites {

    @JsonProperty("other")
    private Other other;
    @JsonProperty("types")
    private Type[] types;

    public PokemonSprites(Other other, Type[] types) {
        this.other = other;
        this.types = types;
    }

    public PokemonSprites() {
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }
}
