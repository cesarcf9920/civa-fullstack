package com.civa.buses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.civa.buses.model.Bus;
import com.civa.buses.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private BusService busService;

	@GetMapping
	public List<Bus> listarTodos() {
		return busService.listarTodos();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Bus> obtenerPorId(@PathVariable Long id) {
		return busService.obtenerPorId(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}	

	  @PostMapping("/agregar")
	  public ResponseEntity<Bus> addBus(@RequestBody Bus bus) {
	    Bus nuevoFutbolista = busService.saveBus(bus);
	    return new ResponseEntity<>(nuevoFutbolista, HttpStatus.CREATED);
	  }

}
