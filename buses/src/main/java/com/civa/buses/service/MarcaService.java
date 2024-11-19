package com.civa.buses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.civa.buses.model.Marca;
import com.civa.buses.repository.MarcaRepository;

@Service
public class MarcaService {
	@Autowired
	private MarcaRepository marcaRepository;

	public Iterable<Marca> listarTodos() {
		return marcaRepository.findAll();
	}

	public Marca saveMarca(Marca marca) {
		return marcaRepository.save(marca);
	}
}
