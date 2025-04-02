package Lista1;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do usuário");
        double valor_usuário = input.nextDouble();

        double valor_representante = ( valor_usuário * 30 ) / 100;
        double valor_imposto = (valor_usuário + 20) / 100;
        double valor_final = valor_usuário + valor_representante + valor_imposto;

        System.out.printf("Valor total:  %s \n Valor do imposto: %s \n Valor do representante: %s \n " , valor_final, valor_imposto, valor_representante);

    }

}
