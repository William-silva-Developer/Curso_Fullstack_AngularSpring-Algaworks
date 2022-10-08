import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormComponent } from './Components/form/form.component';

//IMPORTAÇÕES DO PRIMENG
import {AccordionModule} from 'primeng/accordion';
import {ButtonModule} from 'primeng/button'
import {InputTextModule} from 'primeng/inputtext';
import { TableComponent } from './Components/table/table.component';
import {TableModule} from 'primeng/table'


@NgModule({
  declarations: [
    AppComponent,
    FormComponent,
    TableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AccordionModule,
    ButtonModule,
    InputTextModule,
    TableModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
