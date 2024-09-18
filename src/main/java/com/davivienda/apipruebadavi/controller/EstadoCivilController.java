package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.service.EstadoCivilService;


@RestController
public class EstadoCivilController {

    @Autowired
    private EstadoCivilService estadoCivilService;

    @GetMapping("/getEstadosCiviles")
    public ResponseEntity<?> getEstadosCiviles() {
        return estadoCivilService.getAllEstadosCiviles();
    }
}