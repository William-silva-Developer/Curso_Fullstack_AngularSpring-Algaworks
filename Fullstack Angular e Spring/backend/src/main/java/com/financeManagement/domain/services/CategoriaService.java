package com.financeManagement.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.financeManagement.domain.model.Categoria;
import com.financeManagement.domain.repository.CategoriaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoriaService {
	
	private CategoriaRepository categoriaRepor;
	
	@Transactional
	public List<Categoria> tolist(){
		return categoriaRepor.findAll();
	}
	
	
	//PARA SALVAR UMA CATEGORIA
	
	@Transactional
	public Categoria toSave( Categoria categoria) {
		return categoriaRepor.save(categoria);
	};
	
	//PARA BUSCAR CATEGORIA POR ID

	@Transactional
	public Optional<Categoria> toSearchId( Long codigo) {
		return categoriaRepor.findById(codigo);
	};

	//PARA DELETAR CATEGORIA
	
	@Transactional
	public void toDelete(long codigo) {
		 categoriaRepor.deleteById(codigo);
	}

}
