package lista03;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero: ");
        int numero = scanner.nextInt();
        System.out.println("digite o incremento: ");
        int  incremento = scanner.nextInt();

        for (int i = 0; i <= numero; i+=incremento) {
            System.out.println(i);
        }


    }

}
