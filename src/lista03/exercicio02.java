package lista03;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer qtd_idade = 0;
        Integer qtd_altura = 0;
        Integer qtd_peso = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("digite a idade: ");
            Integer idade = scanner.nextInt();

            System.out.println("digite o peso: ");
            double peso = scanner.nextDouble();

            System.out.println("digite a altura: ");
            float altura = scanner.nextFloat();

            if (idade > 0) {
                qtd_idade+= 1;
            }
            if (altura >1.60) {
                qtd_altura+=1;
            }

            if (peso < 80.0) {
                qtd_peso+=1;
            }


        }

        scanner.close();

        System.out.println("Pessoas que tem idade acima de 50 anos: " + qtd_idade);
        System.out.println("Pessoas que tem altura ,maior 1.60: " + qtd_altura);
        System.out.println("Pessoas que tem peso abaixo de 80kg: " + qtd_peso);
    }
}
