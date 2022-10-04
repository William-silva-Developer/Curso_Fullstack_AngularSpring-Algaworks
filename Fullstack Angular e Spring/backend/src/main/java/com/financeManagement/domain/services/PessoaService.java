package com.financeManagement.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.financeManagement.domain.model.Pessoa;
import com.financeManagement.domain.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaService {
	
	private PessoaRepository pessoaRepor;
	
	
	@Transactional
	public List<Pessoa> list(){
		return pessoaRepor.findAll();
	};
	
	@Transactional
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepor.save(pessoa);
	};
	
	
	@Transactional
	public Optional<Pessoa> search(Long codigo){
		return pessoaRepor.findById(codigo);
	};
	
	@Transactional
	public void delete(Long codigo) {
		pessoaRepor.deleteById(codigo);
	}
	
	
	
	
	

}
