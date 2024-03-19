package PET;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = ler.next();
        System.out.println("Digite o nome: ");
        String especie = ler.next();
        System.out.println("Digite o nome: ");
        int idade = ler.nextInt();
        Pet pet = new Pet(nome,especie,idade);
//            pet.nome = "Ana";
//            pet.especie = "Border Collie";
//            pet.idade = 1;
            pet.exibir();
        }
    }

