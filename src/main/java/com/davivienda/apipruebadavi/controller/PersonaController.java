package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.model.Persona;
import com.davivienda.apipruebadavi.service.PersonaService;


@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/getClientes")
    public ResponseEntity<?> getClientes() {
        return personaService.getAllPersonas();
    }
    
    @GetMapping("/getCliente/{id}")
    public ResponseEntity<?> getCliente(@PathVariable Long id) {
        return personaService.getPersonaById(id);
    }
    
    @PostMapping("/postCliente")
    public ResponseEntity<?> postCliente(@RequestBody Persona persona) {
        return personaService.saveUpdatePerson(persona);
    }
}