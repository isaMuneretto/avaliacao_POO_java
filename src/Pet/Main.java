package Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o nome do Pet:");
        pet.nome = leia.next();
        System.out.println("Informe a espécie:");
        pet.especie = leia.next();
        System.out.println("Informe a idade:");
        pet.idade = leia.nextInt();
        pet.imprimirDetalhes();
    }
}
