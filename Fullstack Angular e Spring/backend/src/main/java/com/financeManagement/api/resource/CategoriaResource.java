package com.financeManagement.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.financeManagement.api.assembler.CategoriaAssembler;
import com.financeManagement.api.modelDto.CategoriaDto;
import com.financeManagement.domain.model.Categoria;
import com.financeManagement.domain.repository.CategoriaRepository;
import com.financeManagement.domain.services.CategoriaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/categorias")
@RestController
public class CategoriaResource {
	
	private CategoriaRepository categoriaRepor;
	
	private CategoriaService categoriaService;
	
	private CategoriaAssembler categoriaAssembler;
	
	
	
	//MÉTODO PARA LISTAR TODAS AS CATEGORIAS
	
	@GetMapping
	public List<Categoria> List(){
		return categoriaService.tolist();
	};
	
	//MÉTODO PARA SALVAR UMA NOVA CATEGORIA
	
	@PostMapping
	public ResponseEntity<Categoria> toInsert(@Valid @RequestBody Categoria categoria, HttpServletResponse response){
		Categoria categoriaSalv = categoriaService.toSave(categoria);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("{/codigo}")
				.buildAndExpand(categoriaSalv.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(categoriaSalv);
	};
	
	
	//MÉTODO PARA BUSCAR POR ID.
	
	@GetMapping("/{codigo}")
	public ResponseEntity<CategoriaDto> toSearch(@PathVariable Long codigo) {
		
		return categoriaService.toSearchId(codigo)
				.map(entregar -> ResponseEntity.ok(categoriaAssembler.toModel(entregar)))
				.orElse(ResponseEntity.notFound().build());
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
