/*CONTROLE DE PAGAMENTO DE IPVA PELA TERMINAÇÃO DAS PLACAS DOS CARROS */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o último digito da placa: ");
        int digitoFinal = entrada.nextInt();
        
        switch(digitoFinal){
            case 1:
            System.out.println("Você tem até 30 de Janeiro para quitar seu IPVA.");
            break;
            case 2:
            System.out.println("Você tem até 28 de Fevereiro para quitar seu IPVA.");
            break;
            case 3:
            System.out.println("Você tem até 30 de Março para quitar seu IPVA.");
            case 4:
            System.out.println("Você tem até 30 de Abriu para quitar seu IPVA.");
            break;
            default:
            System.out.println("Você informou um valor inválido!");
        }
    }
}
