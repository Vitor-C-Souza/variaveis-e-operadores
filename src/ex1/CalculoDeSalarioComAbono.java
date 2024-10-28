package ex1;

import java.util.Scanner;

public class CalculoDeSalarioComAbono {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float salario;
        float abono;

        System.out.println("Digite o Salario: ");
        salario = read.nextFloat();

        System.out.println("Digite o Abono: ");
        abono = read.nextFloat();

        float novoSalario = salario + abono;

        System.out.println("O novo salario é: " + novoSalario);

        read.close();
    }
}
