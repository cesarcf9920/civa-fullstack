package com.civa.buses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.civa.buses.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
