package com.davivienda.apipruebadavi.service;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.WebServiceFaultException;
import org.springframework.ws.client.WebServiceTransportException;
import org.tempuri.Person;

import com.davivienda.apipruebadavi.process.SoapDemoProcess;

@Service
public class SoapDemoService {
	
	private static final Logger log = LoggerFactory.getLogger(SoapDemoService.class);
	
	@Autowired
    private SoapDemoProcess soapDemoProcess;

    public ResponseEntity<?> consultarInfoPersona(String id) {
    	try {
            Person person = soapDemoProcess.consultarInfoPersona(id);
            return ResponseEntity.ok().body(Collections.singletonMap("resultado", person));
        } catch (WebServiceTransportException e) {
            log.error("SOAP transport error", e);
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(Collections.singletonMap("error", "Error de transporte SOAP"));
        } catch (WebServiceFaultException e) {
            log.error("SOAP fault error", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error en el servicio SOAP"));
        } catch (Exception e) {
            log.error("General error", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Collections.singletonMap("error", "Error interno del servidor"));
        }
    }
}
