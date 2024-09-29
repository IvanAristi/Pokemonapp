package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DreamWorld {
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_female")
    private String frontFemale;

    public DreamWorld() {
    }

    public DreamWorld(String frontDefault, String frontFemale) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        this.frontFemale = frontFemale;
    }
}
