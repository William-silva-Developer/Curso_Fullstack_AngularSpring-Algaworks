package com.financeManagement.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

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
	};
	
	
	public List<CategoriaDto> toCollectionDto(List<Categoria> array){
		return array.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
