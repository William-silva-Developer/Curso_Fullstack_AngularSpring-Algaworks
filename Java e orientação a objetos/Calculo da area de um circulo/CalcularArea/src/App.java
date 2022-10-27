import java.util.Scanner;

/*
 Um professor universitário precisa de um programa para calcular a área de um círculo a partir do raio. Isso irá economizar bastante tempo dele ao elaborar exercícios para seus alunos.

O programa tem outros requisitos importantes para o professor: incluir uma opção para exibir (ou não) a fórmula usada para calcular a área e sempre exibir o resultado com casas decimais e também em inteiro.

O professor ficou sabendo que você está estudando Java e decidiu contratar seus serviços. Então, mãos à obra!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);


        float pi = 3.14f;

        
        
        System.out.println("Informe o raio: ");
        float raio = entrada.nextFloat();
        
        System.out.println("Didite 0 para calcular com float ou digite 1 para calcular como inteiro: ");
        int opcao= entrada.nextInt();
        
        float area = raio * raio * pi;

        int areaInt = (int) area;

        if(opcao == 1){
            System.out.println("O valor da area é: "+areaInt);
        }else if(opcao == 0){
            System.out.println("O valor da area é: "+ area);
        }else{
            System.out.println("Você informou um valor inválido.");
        };

     


    }
}
