package br.com.petz.clientepet.pet.Application.service;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import br.com.petz.clientepet.pet.Application.api.PetClienteDetalhadoResponse;
import br.com.petz.clientepet.pet.Application.api.PetClienteListResponse;
import br.com.petz.clientepet.pet.Application.api.PetRequest;
import br.com.petz.clientepet.pet.Application.api.PetResponse;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalhadoResponse buscaPetDoClienteComId(UUID idCliente, UUID idPet);
	void deletaPetDoClienteComID(UUID idCliente, UUID idPet);
}
