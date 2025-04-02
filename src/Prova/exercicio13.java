package Prova;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cliente comum: 5%\ncliente ouro: 10%\n cliente Preimum: 15%\n");

        System.out.println("Digite o preco: ");
        float preco = scanner.nextFloat();
        System.out.println("Qual categoria o cliente é?\n 1-Comum\n 2-Ouro\n 3-Premium");
        int categoria = scanner.nextInt();
        float resultado = 0;

        if(categoria == 1){
            resultado =  preco -= (preco * 5) / 100;
            System.out.printf("Desconto de 5 porcento aplicado: %s" , resultado);
        } else if (categoria == 2) {
            resultado =  preco -= (preco *10) / 100;
            System.out.printf("Desconto de 10 porcento aplicado: %s" , resultado);
        }else{
            resultado =  preco -= (preco *15) / 100;
            System.out.printf("Desconto de 15 porcento aplicado: %s" , resultado);
        }


    }
}
