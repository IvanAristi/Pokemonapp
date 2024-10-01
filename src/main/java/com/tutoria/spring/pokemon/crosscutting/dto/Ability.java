package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability {
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    private String id;

    public Ability(String name, String url, String id) {
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public Ability() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
