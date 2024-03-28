package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Animal animal = new Animal();
        System.out.println("Informe o nome do animal:");
        animal.nome = leia.next();
        System.out.println("Informe o tipo:");
        animal.tipo = leia.next();
        System.out.println("Informe a idade:");
        animal.idade = leia.nextInt();
        System.out.println("Informe o som:");
        String som = leia.next();

        animal.emitirSom(som);

    }
}
