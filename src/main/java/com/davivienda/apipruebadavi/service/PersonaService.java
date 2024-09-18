package com.davivienda.apipruebadavi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.davivienda.apipruebadavi.model.Persona;
import com.davivienda.apipruebadavi.repository.PersonaRepository;

import jakarta.transaction.Transactional;

import java.util.Collections;

@Service
@Transactional
public class PersonaService {

	private static final Logger log = LoggerFactory.getLogger(PersonaService.class);

	@Autowired
	private PersonaRepository personaRepository;

	public ResponseEntity<?> getAllPersonas() {
		try {
			return ResponseEntity.ok().body(personaRepository.findAll());
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}

	public ResponseEntity<?> getPersonaById(Long id) {
		try {
			return ResponseEntity.ok().body(personaRepository.findById(id));
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}

	public ResponseEntity<?> saveUpdatePerson(Persona persona) {
		try {
			return ResponseEntity.ok().body(personaRepository.save(persona));
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}
}