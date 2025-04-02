package lista2;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de gols do time 01");
        Integer time01 = input.nextInt();
        System.out.println("Digite a quantidade de gols do time 01");
        Integer time02 = input.nextInt();

        if (time01 > time02){
            System.out.println("time 1 marcou mais");
        } else if (time02 > time01) {
            System.out.println("Time 2 marcou mais");
        }else {
            System.out.println("Empate");
        }
    }
}
