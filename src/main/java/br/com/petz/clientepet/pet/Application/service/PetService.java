package br.com.petz.clientepet.pet.Application.service;

import java.util.UUID;

import javax.validation.Valid;

import br.com.petz.clientepet.pet.Application.api.PetRequest;
import br.com.petz.clientepet.pet.Application.api.PetResponse;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
}
