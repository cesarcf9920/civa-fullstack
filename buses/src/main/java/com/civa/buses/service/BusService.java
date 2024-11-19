package com.civa.buses.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.civa.buses.model.Bus;
import com.civa.buses.repository.BusRepository;
import com.civa.buses.repository.MarcaRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BusService {
	@Autowired
	private BusRepository busRepository;
	@Autowired
	private MarcaRepository marcaRepository;

	public List<Bus> listarTodos() {
		return busRepository.findAll();
	}

	public Optional<Bus> obtenerPorId(Long id) {
		return busRepository.findById(id);
	}

	public Bus saveBus(Bus bus) {
		if (bus.getMarca() != null && !marcaRepository.existsById(bus.getMarca().getId())) {
			throw new EntityNotFoundException("Posicion with id " + bus.getMarca().getId() + " not found");
		}
		return busRepository.save(bus);
	}
}
