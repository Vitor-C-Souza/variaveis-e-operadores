package ex2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        float media = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            float nota = read.nextFloat();
            media += nota;
        }

        System.out.println("Média: " + df.format(media / 4));
    }
}
