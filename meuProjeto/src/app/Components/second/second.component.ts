import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {



  nome!: string;
  adicionado: boolean = false;


adicionando(nome: string){
  this.nome = nome;
  this.adicionado = true;
};


  constructor() { }

  ngOnInit(): void {
  }

}
