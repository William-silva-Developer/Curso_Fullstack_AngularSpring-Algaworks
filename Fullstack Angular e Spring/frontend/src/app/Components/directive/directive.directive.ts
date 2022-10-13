import { Directive, HostBinding, HostListener} from '@angular/core';

@Directive({
  selector: '[appDirective]'
})
export class DirectiveDirective {

  @HostBinding('style.backgroundColor')fundo!: string;

//QUANDO O CURSOR FICAR NO INPUT GANHARÁ A COR #ede1e1
  @HostListener('focus') cursorOn(){
    this.fundo = '#ede1e1';
  };

   //QUANDO O CURSOR SAIR DO INPUT PEDERÁ A COR
  @HostListener('blur') cursorOff(){
    this.fundo = 'transparent';
  }


  /*
  constructor(
    private elementRef: ElementRef,
    private renderer: Renderer2
  ) {}

  //QUANDO O CURSOR FICAR NO INPUT GANHARÁ A COR #ede1e1
  @HostListener('focus') cursorOn(){
    this.renderer.setStyle(this.elementRef.nativeElement,'background-color', '#ede1e1');
  };



  //QUANDO O CURSOR SAIR DO INPUT PEDERÁ A COR
  @HostListener('blur') cursorOff(){
    this.renderer.setStyle(this.elementRef.nativeElement,'background-color', 'transparent');
  }
*/
}
