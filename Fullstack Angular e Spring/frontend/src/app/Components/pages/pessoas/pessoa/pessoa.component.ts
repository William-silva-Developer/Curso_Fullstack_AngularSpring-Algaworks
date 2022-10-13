import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pessoa',
  templateUrl: './pessoa.component.html',
  styleUrls: ['./pessoa.component.css']
})
export class PessoaComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  lancamentos = [
    {Nome: 'Paulo sirqueira', Cidade: 'Parnamirim', Estado: 'RN', Ativo: true},
    {Nome: 'Paulo silva', Cidade: 'Natal', Estado: 'RN', Ativo: true},
    {Nome: 'Amanda perreira', Cidade: 'Pau dos Ferros', Estado: 'RN', Ativo: false},
    {Nome: 'Paulo sirqueira junior', Cidade: 'João Camara', Estado: 'RN', Ativo: false},
    {Nome: 'Carla sirqueira de andrade', Cidade: 'Marcaiba', Estado: 'RN', Ativo: true},
    {Nome: 'Paulo ricardo junior', Cidade: 'Parnamirim', Estado: 'RN', Ativo: true},
    {Nome: 'Flavio perreira da silva', Cidade: 'Maxaranguape', Estado: 'RN', Ativo: true},
    {Nome: 'William sirqueira junior', Cidade: 'Parnamirim', Estado: 'RN', Ativo: false}

  ];

}
