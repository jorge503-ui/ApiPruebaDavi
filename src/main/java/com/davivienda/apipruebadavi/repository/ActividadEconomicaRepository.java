package com.davivienda.apipruebadavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davivienda.apipruebadavi.model.ActividadEconomica;

@Repository
public interface ActividadEconomicaRepository extends JpaRepository<ActividadEconomica, Long> {
}
