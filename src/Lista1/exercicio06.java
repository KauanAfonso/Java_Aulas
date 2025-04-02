package Lista1;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota 1: \n");
        double nota1 = input.nextDouble();
        System.out.println("Digite a nota 2: \n");
        double nota2 = input.nextDouble();

        double media = (nota1 * 0.40) + (nota2 * 0.60);
        System.out.printf("Media ponderada: %.2f" , media);
    }
}
