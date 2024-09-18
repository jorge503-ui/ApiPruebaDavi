package com.davivienda.apipruebadavi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.davivienda.apipruebadavi.repository.ActividadEconomicaRepository;

import java.util.Collections;

@Service
public class ActividadEconomicaService {

	private static final Logger log = LoggerFactory.getLogger(ActividadEconomicaService.class);

	@Autowired
	private ActividadEconomicaRepository actividadEconomicaRepository;

	public ResponseEntity<?> getAllActividadesEconomicas() {
		try {
			return ResponseEntity.ok().body(actividadEconomicaRepository.findAll());
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}
}