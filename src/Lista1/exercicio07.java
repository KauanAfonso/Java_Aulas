package Lista1;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        float salario = 1500;
        System.out.println("Quantidade de carros vendidos? ");
        float quantidade_de_carros_vendidos = input.nextInt();

        String mes = input.nextLine();
        System.out.println("Quanto a loja vendeu? ");

        float valor_loja_vendeu = input.nextInt();
        double comissao = (quantidade_de_carros_vendidos * 350) + ((valor_loja_vendeu * 0.001));

        System.out.printf("Salario:  %s\n mes: %s\n comissao\n: %s , salario final\n: %s" , salario, mes, comissao, salario + comissao);

    }
}
