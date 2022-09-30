package com.financeManagement.api.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeManagement.api.model.Categoria;
import com.financeManagement.api.repository.CategoriaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/categorias")
@RestController
public class CategoriaResource {
	
	private CategoriaRepository categoriaRepor;
	
	@GetMapping
	public List<Categoria> toList(){
		return categoriaRepor.findAll();
	};

}
