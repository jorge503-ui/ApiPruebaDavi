package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.service.FormaDePagoService;


@RestController
public class FormaDePagoController {

    @Autowired
    private FormaDePagoService formaDePagoService;

    @GetMapping("/getFormasDePago")
    public ResponseEntity<?> getFormasDePago() {
        return formaDePagoService.getAllFormasDePago();
    }
}