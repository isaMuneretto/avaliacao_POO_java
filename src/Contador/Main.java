package Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Contador contador = new Contador();
        System.out.println("Digite um valor para contador:");
        contador.valor = leia.nextDouble();
        contador.incrementarValor();
        contador.valorAtual();
        contador.decrementarValor();
        contador.valorAtual();
    }
}
