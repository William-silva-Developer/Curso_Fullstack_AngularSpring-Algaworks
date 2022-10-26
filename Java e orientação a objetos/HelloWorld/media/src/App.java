import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        float preco1 = entrada.nextFloat();

        System.out.println("Digite o segundo valor: ");
        float preco2 = entrada.nextFloat();


        System.out.println("Digite o terceiro valor: ");
        float preco3 = entrada.nextFloat();

        Float media = (preco1 + preco2 + preco3) / 3;

        System.out.println("A média é: "+media);


        
    }


    
}
