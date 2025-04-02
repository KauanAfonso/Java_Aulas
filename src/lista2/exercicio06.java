package lista2;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Random numero_aleatorio = new Random();
        Integer numero_sorteado = numero_aleatorio.nextInt(101);
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Qual o número aleatorio? ");
            Integer numero = input.nextInt();

            if (numero == numero_sorteado){
                System.out.println("Acertou");
                break;
            }
        }
        System.out.printf("O numero era %s: ", numero_sorteado);
    }

}
