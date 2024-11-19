package com.civa.buses.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Marca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;

	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Bus> buses;
	
	public Marca() {
		super();
	}

	public Marca(Long id, String nombre, Set<Bus> buses) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.buses = buses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}

	
}
