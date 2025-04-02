package Lista1;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        double numero = input.nextDouble();

        System.out.printf("Número é %s\n", numero);
        System.out.printf("Número antecessor é %s\n", numero - 1);
        System.out.printf("Número sucessor é %s\n", numero + 1);
    }
}
