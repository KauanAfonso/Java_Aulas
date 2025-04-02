package Prova;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite  um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("digite  um número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Número menor: " + Math.min(numero1,numero2));

    }
}
