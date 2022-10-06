import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {


  
  nome!: string;


adicionando(nome: string){
  this.nome = nome;
};


  constructor() { }

  ngOnInit(): void {
  }

}
