import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor = 0;
        double soma = 0;
        /*BLOCO USANDO O "DO WHILE" GARANTE QUE O BLOCO DE CÓDIGO IRÁ RODAR PELO MENOS UMA VEZ. */

        do {
            System.out.println("Informe o valor diferente de 0. Caso que encerrar o programa digite o 0: ");
            valor = entrada.nextDouble();
            soma += valor;
            System.out.println("Soma: "+soma);
            
        } while (valor != 0);
        System.out.println("O programa foi encerrado. Obrigado por usar nossos serviços.");
    
        
    }
    
}
