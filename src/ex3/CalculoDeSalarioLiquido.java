package ex3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculoDeSalarioLiquido {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        List<String> datas = Arrays.asList("salario bruto", "adicional noturno", "hora extra", "desconto");
        float salarioLiquido = 0, value = 0;
        for (String data : datas) {
            String mensagem = (data.equals("hora extra")) ? "Digite a " + data + ":" : "Digite o " + data + ":";
            System.out.println(mensagem);
            value = read.nextFloat();

            if (data.equals("hora extra")) {
                value *= 5;
            } else if (data.equals("desconto")) {
                break;
            }
            salarioLiquido += value;
        }

        System.out.println("Salario liquido: R$" + df.format(salarioLiquido - value));
    }
}
