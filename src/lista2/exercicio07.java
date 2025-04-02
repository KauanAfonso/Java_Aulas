package lista2;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha 1 ou 2");
        Integer pergunta = input.nextInt();
        input.nextLine();
        String reposta;

        if(pergunta == 1){
            System.out.println("Que cor é a bandeira azul?");
            System.out.println("A- azul");
            System.out.println("B-Vermelho");
            System.out.println("C-Amarelho");

            reposta = input.nextLine();
            if(reposta.equalsIgnoreCase("a")){
                System.out.println("Acertou");
            }else{
                System.out.println("Tente novamente");
            }
        input.close();

        }else{
            System.out.println("Que cor é a bandeira amarela?");
            System.out.println("A- azul");
            System.out.println("B-Vermelho");
            System.out.println("C-Amarelho");
            reposta = input.next();

            if(reposta.equalsIgnoreCase("C")){
                System.out.println("Acertou");
            }else{
                System.out.println("Tente novamente");
            }
        }
    }
}
