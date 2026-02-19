package ex1;

import java.util.Scanner;

public class Principal {
    static void main() {

        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do seu pet: ");
        String nome = sc.next();
        IO.println("Digite a idade do seu pet: ");
        int idade = sc.nextInt();
        IO.println("Digite o sexo do seu pet: ");
        String sexo = sc.next();
        IO.println("Digite a raça do seu pet: ");
        String raca = sc.next();

        Cachorro cachorro = new Cachorro(nome, idade, sexo, raca);
        IO.println(cachorro);

        Gato gato = new Gato(nome, idade, sexo, raca);
        IO.println(gato);
    }
}
