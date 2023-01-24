package br.com.petz.clientepet.cliente.application.api;



import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClienteController implements ClipenteAPI {

	@Override
	public ClienteResponse postCliente( ClienteRequest clenteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		log.info("[finaliza] ClienteController - postCliente");
		return null;
	}

}
