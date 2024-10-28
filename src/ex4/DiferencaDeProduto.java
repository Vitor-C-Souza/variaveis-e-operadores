package ex4;

import java.util.Scanner;

public class DiferencaDeProduto {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float n1 = read.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float n2 = read.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        float n3 = read.nextFloat();
        System.out.println("Digite o quarto numero: ");
        float n4 = read.nextFloat();

        float diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + diferenca);
    }
}
