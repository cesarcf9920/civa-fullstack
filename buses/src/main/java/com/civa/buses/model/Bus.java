package com.civa.buses.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "numeroBus")
	private String numeroBus;
	@Column(name = "placa")
	private String placa;
	@Column(name = "fechaCreacion")
	private LocalDate fechaCreacion;
	@Column(name = "caracteristicas")
	private String caracteristicas;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "marca_id")
	@JsonBackReference
	private Marca marca;

	public Bus() {
		super();
	}

	public Bus(Long id, String numeroBus, String placa, LocalDate fechaCreacion, String caracteristicas, Marca marca) {
		super();
		this.id = id;
		this.numeroBus = numeroBus;
		this.placa = placa;
		this.fechaCreacion = fechaCreacion;
		this.caracteristicas = caracteristicas;
		this.marca = marca;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroBus() {
		return numeroBus;
	}

	public void setNumeroBus(String numeroBus) {
		this.numeroBus = numeroBus;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", numeroBus=" + numeroBus + ", placa=" + placa + ", fechaCreacion=" + fechaCreacion
				+ ", caracteristicas=" + caracteristicas + ", marca=" + marca + "]";
	}
	
	

}
