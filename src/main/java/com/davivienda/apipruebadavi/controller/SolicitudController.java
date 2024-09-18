package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.model.Solicitud;
import com.davivienda.apipruebadavi.service.SolicitudService;

@RestController
public class SolicitudController {

    @Autowired
    private SolicitudService solicitudService;

    @GetMapping("/getSolicitudesByPerson/{id}")
    public ResponseEntity<?> getSolicitudesByPerson(@PathVariable Long id) {
        return solicitudService.getSolicitudesByPersonaId(id);
    }

    @PostMapping("/postSolicitud")
    public ResponseEntity<?> postSolicitudes(@RequestBody Solicitud solicitud) {
        return solicitudService.saveUpdateSolicitud(solicitud);
    }
}
