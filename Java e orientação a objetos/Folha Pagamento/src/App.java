import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas normais: ");
        double horasNormal = entrada.nextDouble();

        System.out.println("Informe o valor da hora normal: ");
        double valorHorasNomais = entrada.nextDouble();

        System.out.println("Informe a quantidade de horas extras: ");
        double horaExtra = entrada.nextDouble();

        System.out.println("Informe o valor da hora extra: ");
        double valorHorasExtras = entrada.nextDouble();

        System.out.println("Informe o salário base do colaborador: ");
        double salarioBase = entrada.nextDouble();

        FolhaPagamento salario1 = new FolhaPagamento();
       

        double jose = salario1.calcularSalario(horasNormal, valorHorasExtras, valorHorasNomais, valorHorasExtras, salarioBase);

       
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------Folha de Salários----------------------------");
        System.out.println("Salário do funcionario José: R$ "+jose);
        System.out.println("-------------------------------------------------------------------");
       
    }
}
