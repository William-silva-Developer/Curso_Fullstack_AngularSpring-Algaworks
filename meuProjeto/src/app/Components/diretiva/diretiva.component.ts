import { Component, OnInit } from '@angular/core';
import Funcionario from '../funcionario'

@Component({
  selector: 'app-diretiva',
  templateUrl: './diretiva.component.html',
  styleUrls: ['./diretiva.component.css']
})
export class DiretivaComponent implements OnInit {



  ultimoId = 0;
  nome = 'Thiago';
  adicionado = false;
  funcionarios: Funcionario[] = [];



  adicionar(){
    console.log(`Adicionando ${this.nome}`);
    this.adicionado = true;


    this.funcionarios.push({
      id: ++this.ultimoId,
      nome: this.nome

    });
  }

  constructor() { }

  ngOnInit(): void {
  }

}
