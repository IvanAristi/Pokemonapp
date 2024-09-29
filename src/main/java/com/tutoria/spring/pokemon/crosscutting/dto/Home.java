package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Home {
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_female")
    private String frontFemale;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_shiny_female")
    private String frontShinyFemale;

    public Home() {
    }

    public Home(String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
        this.frontShiny = frontShiny;
        this.frontShinyFemale = frontShinyFemale;
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

    public String getFrontShiny() {
        return frontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }
}
