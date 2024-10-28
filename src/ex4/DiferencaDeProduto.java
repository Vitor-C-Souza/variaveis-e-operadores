package ex4;

import java.util.Scanner;

public class DiferencaDeProduto {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float numero, numeroMultiplicado = 0, resul1 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            numero = read.nextFloat();

            switch (i) {
                case 0:
                case 2:
                    numeroMultiplicado = numero;
                    break;
                case 1:
                    resul1 = numeroMultiplicado * numero;
                    break;
                default:
                    System.out.println("Diferença: " + (resul1 - (numeroMultiplicado * numero)));
            }
        }
    }
}
