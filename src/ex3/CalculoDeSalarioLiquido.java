package ex3;

import java.util.Scanner;

public class CalculoDeSalarioLiquido {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o salario bruto:");
        float salarioBruto = read.nextFloat();
        System.out.println("Digite o adicional noturno:");
        float adicionalNoturno = read.nextFloat();
        System.out.println("Digite as horas extras:");
        float horasExtras = read.nextFloat();
        System.out.println("Digite os descontos:");
        float descontos = read.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("Salário liquido: " + salarioLiquido);
    }
}
