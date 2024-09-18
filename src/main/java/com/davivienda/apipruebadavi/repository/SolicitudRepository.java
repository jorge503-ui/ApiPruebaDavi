package com.davivienda.apipruebadavi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davivienda.apipruebadavi.model.Solicitud;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
	List<Solicitud> findByPersonaId(Long personaId);
}