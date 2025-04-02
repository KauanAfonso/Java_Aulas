package lista2;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade atual de prduto");
        Integer quantidade_atual = input.nextInt();

        System.out.println("Digite a quantidade maxima de prduto");
        Integer quantidade_maxima = input.nextInt();

        System.out.println("Digite a quantidade minima de prduto");
        Integer quantidade_minima = input.nextInt();

        double quantidade_media = (quantidade_maxima + quantidade_minima )/ 2;

        if(quantidade_atual >= quantidade_media){
            System.out.println("Não precisa comprar");
        }else{
            System.out.printf("Precia comprar");
        }


    }
}
