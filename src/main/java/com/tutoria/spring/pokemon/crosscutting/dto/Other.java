package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Other {
    @JsonProperty("dream_world")
    private DreamWorld dreamWorld;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("official-artwork")
    private OfficialArtwork officialArtwork;

    public Other(DreamWorld dreamWorld, Home home, OfficialArtwork officialArtwork) {
        this.dreamWorld = dreamWorld;
        this.home = home;
        this.officialArtwork = officialArtwork;
    }

    public Other() {
    }

    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    public void setOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
    }
}
