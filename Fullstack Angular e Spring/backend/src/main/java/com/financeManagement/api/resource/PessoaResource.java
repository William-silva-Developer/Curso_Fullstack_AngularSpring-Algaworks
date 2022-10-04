package com.financeManagement.api.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.financeManagement.domain.model.Pessoa;
import com.financeManagement.domain.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pessoas")
@AllArgsConstructor
public class PessoaResource {
	
	private PessoaRepository pessoaRepor;
	
	// MÉTODO PARA LISTAR
	
	@GetMapping
	public List<Pessoa> List() {
		return pessoaRepor.findAll();
	};
	
	//MÉTODO PARA BUSCAR POR CÓDIGO
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Pessoa> toSearch(@PathVariable Long codigo){
		
		return pessoaRepor.findById(codigo)
				.map(pessoa -> ResponseEntity.ok().body(pessoa))
				.orElse(ResponseEntity.notFound().build());
		
		
	};
	
	//MÉTODO PARA INSERIR UMA NOVA PESSOA
	
	@PostMapping
	public ResponseEntity<Pessoa> toInsert(@Valid @RequestBody Pessoa pessoa, HttpServletResponse response){
		
		Pessoa pessoaServl = pessoaRepor.save(pessoa);
		URI uri = ServletUriComponentsBuilder.fromCurrentServletMapping().path("/{codigo}")
				.buildAndExpand(pessoaServl.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(pessoaServl);
		
	};
	
	//MÉTODO PARA ATUALIZAR UMA PESSOA
	
	@PutMapping("/{codigo}")
	public ResponseEntity<@Valid Pessoa> toUpdate(@PathVariable Long codigo, @Valid @RequestBody Pessoa pessoa){
		
		if(!pessoaRepor.existsById(codigo)) {
			return ResponseEntity.notFound().build();
		}
		pessoa.setCodigo(codigo);
		pessoa = pessoaRepor.save(pessoa);
		return ResponseEntity.ok(pessoa);
	};
	
	//MÉTODO PARA DELETAR UMA PESSOA
	
	@DeleteMapping("/{codigo}")
	public ResponseEntity<Pessoa> toDelete(@PathVariable Long codigo){
		
		if(!pessoaRepor.existsById(codigo)) {
			return ResponseEntity.notFound().build();
		}
		pessoaRepor.deleteById(codigo);
		return ResponseEntity.noContent().build();
		
	
	}
	
	

}
