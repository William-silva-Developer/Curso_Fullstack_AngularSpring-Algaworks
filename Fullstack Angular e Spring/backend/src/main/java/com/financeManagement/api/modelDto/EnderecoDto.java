package com.financeManagement.api.modelDto;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class EnderecoDto {
    
    private String logradouro;
  
    private String bairro;
    
    private String numero;
    
    private String cidade;
    
    private String estado;
    

}
