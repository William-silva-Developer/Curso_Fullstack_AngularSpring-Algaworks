import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


//COMPONENTES
import { NavbarComponent } from './Components/navbar/navbar.component';
import { FormComponent } from './Components/form/form.component';
import { TableComponent } from './Components/table/table.component';

//IMPORTAÇÕES DO PRIMENG
import {AccordionModule} from 'primeng/accordion';
import {ButtonModule} from 'primeng/button'
import {InputTextModule} from 'primeng/inputtext';
import {TableModule} from 'primeng/table';
import { PaginatorModule } from 'primeng/paginator';
import { TooltipModule } from 'primeng/tooltip';


@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    TableComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AccordionModule,
    ButtonModule,
    InputTextModule,
    TableModule,
    PaginatorModule,
    TooltipModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
