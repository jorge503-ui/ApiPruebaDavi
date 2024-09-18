package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.service.ActividadEconomicaService;


@RestController
public class ActividadEconomicaController {

    @Autowired
    private ActividadEconomicaService actividadEconomicaService;

    @GetMapping("/getActividadesEconomicas")
    public ResponseEntity<?> getActividadesEconomicas() {
        return actividadEconomicaService.getAllActividadesEconomicas();
    }
}