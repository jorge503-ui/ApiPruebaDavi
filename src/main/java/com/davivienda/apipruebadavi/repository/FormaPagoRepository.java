package com.davivienda.apipruebadavi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davivienda.apipruebadavi.model.FormaPago;

@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPago, Long> {
}
