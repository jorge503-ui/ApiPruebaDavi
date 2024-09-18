package com.davivienda.apipruebadavi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.davivienda.apipruebadavi.repository.EstadoCivilRepository;

import java.util.Collections;

@Service
public class EstadoCivilService {

	private static final Logger log = LoggerFactory.getLogger(EstadoCivilService.class);

	@Autowired
	private EstadoCivilRepository estadoCivilRepository;

	public ResponseEntity<?> getAllEstadosCiviles() {
		try {
			return ResponseEntity.ok().body(estadoCivilRepository.findAll());
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}
}