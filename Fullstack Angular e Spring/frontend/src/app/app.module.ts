import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


//COMPONENTES
import { NavbarComponent } from './Components/navbar/navbar.component';
import { LancamentoComponent } from './Components/pages/lancamentos/lancamento/lancamento.component';
import { PessoaComponent } from './Components/pages/pessoas/pessoa/pessoa.component';

//DIRETIVA
import { DirectiveDirective} from './Components/directive/directive.directive';

//IMPORTAÇÕES DO PRIMENG
import {AccordionModule} from 'primeng/accordion';
import {ButtonModule} from 'primeng/button'
import {InputTextModule} from 'primeng/inputtext';
import {TableModule} from 'primeng/table';
import { PaginatorModule } from 'primeng/paginator';
import { TooltipModule } from 'primeng/tooltip';
import {FocusTrapModule} from 'primeng/focustrap';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LancamentoComponent,
    PessoaComponent,
    DirectiveDirective



  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AccordionModule,
    ButtonModule,
    InputTextModule,
    TableModule,
    PaginatorModule,
    TooltipModule,
    FocusTrapModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
