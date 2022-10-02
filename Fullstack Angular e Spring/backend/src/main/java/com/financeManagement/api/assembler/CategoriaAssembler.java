package com.financeManagement.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.financeManagement.api.modelDto.CategoriaDto;
import com.financeManagement.domain.model.Categoria;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class CategoriaAssembler {
	
	private ModelMapper modelMepper;
	
	public CategoriaDto toModel(Categoria categoria) {
		
		return modelMepper.map(categoria, CategoriaDto.class);
	}

}
