package com.financeManagement.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.financeManagement.api.model.Categoria;
import com.financeManagement.api.repository.CategoriaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RequestMapping("/categorias")
@RestController
public class CategoriaResource {
	
	private CategoriaRepository categoriaRepor;
	
	//MÉTODO PARA LISTAR TODAS AS CATEGORIAS
	
	@GetMapping
	public List<Categoria> toList(){
		return categoriaRepor.findAll();
	};
	
	//MÉTODO PARA SALVAR UMA NOVA CATEGORIA
	
	@PostMapping
	public ResponseEntity<Categoria> toInsert(@RequestBody Categoria categoria, HttpServletResponse response){
		Categoria categoriaSalv = categoriaRepor.save(categoria);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("{/codigo}")
				.buildAndExpand(categoriaSalv.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(categoriaSalv);
	};
	
	
	//MÉTODO PARA BUSCAR POR ID.
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Categoria> toSearch(@PathVariable Long codigo) {
		
		return categoriaRepor.findById(codigo)
				.map(category -> ResponseEntity.ok().body(category))
				.orElse(ResponseEntity.notFound().build());
		
	};
	
	
	
	
	
	
	
	
	
	
	
}
