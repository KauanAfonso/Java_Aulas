package Lista1;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número: \n");
        Double numero1 = input.nextDouble();
        System.out.printf("Digite um número: \n");
        Double numero2 = input.nextDouble();

        System.out.printf("Soma: %s \n" ,  numero1 + numero2);
        System.out.printf("Subtração: %s \n" ,  numero1 - numero2);
        System.out.printf("Multi: %s\n" ,  numero1 * numero2);
        System.out.printf("Divisão: %sz\n" ,  numero1 / numero2);
        System.out.printf("Elevação: %s\n" ,  Math.pow(numero1, numero2));
        System.out.printf("Resto de divisao: %s\n" ,  numero1 % numero2);


    }
}
