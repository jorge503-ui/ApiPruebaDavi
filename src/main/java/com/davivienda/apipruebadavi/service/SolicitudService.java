package com.davivienda.apipruebadavi.service;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.davivienda.apipruebadavi.model.Solicitud;
import com.davivienda.apipruebadavi.repository.SolicitudRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SolicitudService {

	private static final Logger log = LoggerFactory.getLogger(SolicitudService.class);

	@Autowired
	private SolicitudRepository solicitudRepository;

	public ResponseEntity<?> getSolicitudesByPersonaId(Long personaId) {
		try {
			return ResponseEntity.ok().body(solicitudRepository.findByPersonaId(personaId));
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}

	public ResponseEntity<?> saveUpdateSolicitud(Solicitud solicitud) {
		try {
			return ResponseEntity.ok().body(solicitudRepository.save(solicitud));
		} catch (Exception e) {
			log.error("Error General", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(Collections.singletonMap("error", "Error interno del servidor"));
		}
	}
}
