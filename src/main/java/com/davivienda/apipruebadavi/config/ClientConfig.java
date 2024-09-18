package com.davivienda.apipruebadavi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class ClientConfig {

	@Value("${WSDL.SOAPClient}")
	private String wsdlUrl;

    @Bean
    Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.tempuri");
		return marshaller;
	}

	@Bean
	WebServiceTemplate getSoapClient(Jaxb2Marshaller marshaller) {
		WebServiceTemplate soapClient = new WebServiceTemplate();
		soapClient.setDefaultUri(wsdlUrl);
		// Serializacion
		soapClient.setMarshaller(marshaller);
		// Deserializacion
		soapClient.setUnmarshaller(marshaller);

		return soapClient;
	}
}
