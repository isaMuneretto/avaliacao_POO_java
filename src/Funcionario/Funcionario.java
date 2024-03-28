package Funcionario;

public class Funcionario {
    String nome;
    String departamento;
    Double salario;

    //Crie um método para aumentar o salário em uma porcentagem passada como argumento.

    public void calcularSalario(Double porcentagem){
        Double aumento = porcentagem/100;
        Double total = salario + (salario * aumento);
        System.out.println("O salário com o aumento é de R$ "+total);
    }
}
