package com.davivienda.apipruebadavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davivienda.apipruebadavi.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
}
