package Prova;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        String condicao = (numero>= 10 && numero <= 20) ? "Está dentro de 10 a 20" : "Não está";
        System.out.println(condicao);
    }

}
