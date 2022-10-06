import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  name: string = "william";
  nome: string = "Angular.";

  adicionar() {
    console.log(`Adicionando ${this.nome}`);

    const numero = Math.round(Math.random() * 100);
    this.nome = this.name + numero;
  }


  alterarNome(event: any){
    this.name = event.target.value;
  }

  constructor() { }

  ngOnInit(): void {
  }

}
