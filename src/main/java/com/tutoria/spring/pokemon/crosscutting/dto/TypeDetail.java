package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TypeDetail {

    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    public TypeDetail(String name, String url) {
        this.name = name;
        this.url = url;
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
}
