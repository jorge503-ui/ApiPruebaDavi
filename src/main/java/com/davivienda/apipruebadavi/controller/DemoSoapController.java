package com.davivienda.apipruebadavi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davivienda.apipruebadavi.service.SoapDemoService;

@RestController
public class DemoSoapController {
	
	@Autowired
	private SoapDemoService soapDemoService;

	@GetMapping("/consultarInfoPersona")
	public ResponseEntity<?>  consultarInfoPersona(@RequestParam String id) {
		return soapDemoService.consultarInfoPersona(id);
	}
}
