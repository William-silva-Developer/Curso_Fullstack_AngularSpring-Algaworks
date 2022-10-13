package com.financeManagement.api.modelDto;

import javax.persistence.Embedded;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDto {
	
	private Long codigo;
	
	private String nome;
	
	private Boolean ativo;
	
	@Embedded
	private EnderecoDto endereco;
	
	
	

}
