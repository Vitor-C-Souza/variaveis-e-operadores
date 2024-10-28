package ex2;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digita a nota 1: ");
        float nota1 = read.nextFloat();
        System.out.println("Digita a nota 2: ");
        float nota2 = read.nextFloat();
        System.out.println("Digita a nota 3: ");
        float nota3 = read.nextFloat();
        System.out.println("Digita a nota 4: ");
        float nota4 = read.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Média: " + media);
    }
}
