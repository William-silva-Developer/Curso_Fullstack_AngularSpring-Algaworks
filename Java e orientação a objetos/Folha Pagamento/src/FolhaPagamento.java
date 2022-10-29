public class FolhaPagamento {


    //MÉTODO PARA CALCULAR O SALÁRIO 
    double calcularSalario(double horaNormal, double horasExtras, double valorHoraNormal, double valorHoraExtra, double salarioBase){

        double valorHoraNormais = horaNormal * valorHoraNormal;
        double valorHoraExtras = horasExtras * valorHoraExtra;

        double valorBase = salarioBase;

        return valorHoraNormais + valorHoraExtras + valorBase;

    };
    
}
