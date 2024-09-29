package com.tutoria.spring.pokemon.crosscutting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityGeneral {

    private Ability ability;
    @JsonProperty("is_hidden")
    private boolean isHidden;
    @JsonProperty("slot")
    private Long slot;

    public AbilityGeneral() {
    }

    public AbilityGeneral(Ability ability, boolean isHidden, Long slot) {
        this.ability = ability;
        this.isHidden = isHidden;
        this.slot = slot;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public Long getSlot() {
        return slot;
    }

    public void setSlot(Long slot) {
        this.slot = slot;
    }
}
