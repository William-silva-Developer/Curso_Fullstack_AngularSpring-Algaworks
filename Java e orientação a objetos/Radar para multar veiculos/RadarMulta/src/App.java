/*
 O Departamento de Trânsito e Transportes de sua cidade descobriu que você está ficando fera em Java e fez uma proposta muito boa para você desenvolver um programa para radares de velocidade.

Seu programa será instalado nos equipamentos que identificam a velocidade dos veículos na via e decidem se merecem uma multa ou se podem passar sem problemas. O secretário do departamento passou as seguintes regras:

Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.
O programa deve receber as informações de velocidade máxima permitida e a velocidade do veículo através do teclado do computador. No futuro eles pretendem melhorar isso para não precisar que alguém fique o tempo todo digitando as informações.

1. Crie um programa chamado "MultaVeiculo" e inclua o código que recebe os parâmetros do usuário.
 */

 import java.util.Scanner;



public class App {
    private static double velicidadeVeiculo;

    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);

        
       
        System.out.println("Qual o tipo do veiculo(Caminhão ou passeio)?: ");   
        String tipo = entrada.next();

        System.out.println("Qual a velicidade máxima da avenida? ");
        double velicidadeMaxima = entrada.nextDouble();

        System.out.println("Informe a velocidade do veiculo? ");
        velicidadeVeiculo = entrada.nextDouble();
        
        if (tipo.equals("passeio") && (velicidadeVeiculo > velicidadeMaxima * 1.1)) {
            System.out.println("Seu veiculo foi multado!");
        }else if(tipo.equals("caminhão") && (velicidadeVeiculo > velicidadeMaxima * 1.05)){
            System.out.println("Seu caminhão foi multado.");
        }else{
            System.out.println("Entrada inválida!");
        };
            
            
        
    };
}