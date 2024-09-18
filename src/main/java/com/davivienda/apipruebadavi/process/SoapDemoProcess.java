package com.davivienda.apipruebadavi.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.WebServiceFaultException;
import org.springframework.ws.client.WebServiceTransportException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.tempuri.FindPerson;
import org.tempuri.FindPersonResponse;
import org.tempuri.Person;

@Component
public class SoapDemoProcess {

	private static final Logger log = LoggerFactory.getLogger(SoapDemoProcess.class);

	@Value("${WSDL.SOAPClient}")
	private String wsdlUrl;

	@Autowired
	private WebServiceTemplate webServiceTemplate;

	public Person consultarInfoPersona(String id) {
		FindPerson findPerson = new FindPerson();
		findPerson.setId(id);
		log.info("Respodiendo para la persona " + id);
		SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/SOAP.Demo.FindPerson");
		try {
			FindPersonResponse findPersonResult = (FindPersonResponse) webServiceTemplate.marshalSendAndReceive(wsdlUrl,
					findPerson, soapActionCallback);
			return findPersonResult.getFindPersonResult();
		} catch (WebServiceTransportException e) {
			log.error("SOAP transport error", e);
			throw e;
		} catch (WebServiceFaultException e) {
			log.error("SOAP fault error", e);
			throw e;
		} catch (Exception e) {
			log.error("General error", e);
			throw e;
		}
	}

}
