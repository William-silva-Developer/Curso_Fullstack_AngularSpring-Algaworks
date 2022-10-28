import java.util.Scanner;

public class Loop {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o inicio do loop: ");
        int inicio = entrada.nextInt();

        System.out.println("Informe o final do loop: ");
        int finalLoop = entrada.nextInt();

        /*SEM ADICIONAR O INICIO++ DENTRO DO WHILE FICARÁ RODANDO INFINITAMENTE */

        while (inicio <= finalLoop) {
            System.out.println("Sou um loop");
            inicio++;
            
        };
    }
    
}
