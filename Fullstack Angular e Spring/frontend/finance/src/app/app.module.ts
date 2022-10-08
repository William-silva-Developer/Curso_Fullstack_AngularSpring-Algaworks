import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//PRIMENG
import {InputTextModule} from 'primeng/inputtext';
import {AccordionModule} from 'primeng/accordion';

import {ButtonModule} from 'primeng/button'


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    InputTextModule,
    ButtonModule,
    AccordionModule,


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
