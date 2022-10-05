package com.financeManagement.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.financeManagement.api.modelDto.PessoaDto;
import com.financeManagement.domain.model.Pessoa;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class PessoaAssembler {
	
	private ModelMapper modelMepper;
	
	
	
	//MÉTODO QUE PODE SER USADO PARA BUSCAR POR CÓDIGO
	public PessoaDto toModel(Pessoa pessoa) {
		
		return modelMepper.map(pessoa, PessoaDto.class);
	};
	
	
	//MÉTODO PARA LISTAR PESSOAS EM DTO
	public List<PessoaDto> toCollection(List<Pessoa> array){
		return array.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}

}
