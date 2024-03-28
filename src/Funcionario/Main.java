package Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do funcionario:");
        funcionario.nome = leia.next();

        System.out.println("Informe o departamento:");
        funcionario.departamento = leia.next();

        System.out.println("Informe o salario:");
        funcionario.salario = leia.nextDouble();

        System.out.println("Informe a porcentagem do aumento:");
        Double porcentagem = leia.nextDouble();

        funcionario.calcularSalario(porcentagem);

    }
}
