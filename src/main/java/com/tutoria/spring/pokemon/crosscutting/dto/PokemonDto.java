package com.tutoria.spring.pokemon.crosscutting.dto;


import java.util.List;

public class PokemonDto {
    private Long height;
    private String name;
    private Long id;
    private Long order;
    private Long weight;
    private List<AbilityGeneral> abilities;
    private PokemonSprites sprites;

    public PokemonDto(Long height, String name, Long id, Long order, Long weight, List<AbilityGeneral> abilities, PokemonSprites sprites) {
        this.height = height;
        this.name = name;
        this.id = id;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.sprites = sprites;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public List<AbilityGeneral> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityGeneral> abilities) {
        this.abilities = abilities;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }
}
