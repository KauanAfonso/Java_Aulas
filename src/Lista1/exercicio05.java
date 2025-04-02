package Lista1;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o horário: ");
        double hora = input.nextDouble();

        System.out.println("Digite o minuto: ");
        double minutos = input.nextDouble();

        System.out.println("Digite os segundos: ");
        double segundos = input.nextDouble();

        System.out.printf("Horário em segundos:  %s" , (hora * 120) + (minutos * 60) + segundos );


    }
}
