package com.tutoria.spring.pokemon.crosscutting.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pokemon")
public class Pokemon {

	
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "estatura")
	private Long height;

	@Column(name = "nombre", nullable = false)
	private String name;

	@Column(name = "peso")
	private Long weight;
	

	public Pokemon() {
		super();
	}

	public Pokemon(Long id, Long height, String name, Long weight) {
		super();
		this.id = id;
		this.height = height;
		this.name = name;
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public Long getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public Long getWeight() {
		return weight;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	
	
}
