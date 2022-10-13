
//NÃO PODEMOS MUDAR O VALOR DE UMA CONSTANTE SE ELA FOR DECLARADA DESTE MODO:

const age = 22;

//const age = 23;
/*================================*/

//PODEMOS ALTERAR O VALOR DA CONSTANTE ASSIM:
const idade = 40;

idade = 45;

/*====================================*/
// É POSSÍVEL DECLARÁ O MESMO NOME DE UMA VARIAVEL  DE ELA ESTIVER EM ESCOPOS DIFERENTES

const variavel = 123;

if (variavel > 120) {
    //ESTÁ VARIAVEL ESTÁ DETRO DO ESCOPO DO IF E ELA PODE SER DECLARADA AQUI NOVAMENTE MAS 
    //NÃO ESTARÁ DE MANEIRA GLOBAL
    const idade = 22;
   console.log("Olá Mundo");
    
}

