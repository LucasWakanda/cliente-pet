package br.com.petz.clientepet.pet.Application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.petz.clientepet.pet.domian.Porte;
import br.com.petz.clientepet.pet.domian.SexoPet;
import br.com.petz.clientepet.pet.domian.TipoPet;
import lombok.Value;
@Value
public class PetRequest {
	
	@NotBlank
	private String nomePet;
	private Porte porte;
	@NotNull
	private TipoPet tipo;
	private String microchip;
	@NotBlank
	private String raca;
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
	

}
