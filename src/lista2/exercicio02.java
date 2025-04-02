package lista2;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        float valor_produto = scanner.nextFloat();
        System.out.println("Digite a quantidade");
        float quantidade = scanner.nextFloat();

        float valor_total = valor_produto * quantidade;

        if(quantidade <= 12){
            System.out.printf("Valor do produto: %s" , valor_total );
        }else{
            System.out.printf("Valor do produto: %s" , valor_total - (valor_total * 10 / 100));
        }

    }
}
