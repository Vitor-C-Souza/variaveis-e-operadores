package ex1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculoDeSalarioComAbono {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        List<String> datas = Arrays.asList("Salario", "Abono", "novo salario");
        float salario = 0, value;
        for (String data : datas) {
            if (data.equals("novo salario")) {
                System.out.println("O " + data + " é: R$" + df.format(salario));
                break;
            }
            System.out.println("Digite o " + data);
            value = read.nextFloat();

            salario += value;
        }
    }
}
