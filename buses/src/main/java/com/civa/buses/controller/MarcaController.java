package com.civa.buses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.civa.buses.model.Marca;
import com.civa.buses.service.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaController {
	@Autowired
	private MarcaService marcaService;

	@GetMapping
	public Iterable<Marca> listarTodos() {
		return marcaService.listarTodos();
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<Marca> addPosicion(@RequestBody Marca marca) {
	    Marca nuevaMarca = marcaService.saveMarca(marca);
	    return new ResponseEntity<>(nuevaMarca, HttpStatus.CREATED);
	}
	


}
