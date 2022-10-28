import java.util.Scanner;

public class LoopUsandoFor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe o tamanho do for: ");
        int loop = entrada.nextInt();

        for (var i = 0; i <= loop; i++) {
            System.out.println("Estou em loop. "+i);
            
            
        }
    }
    
}
