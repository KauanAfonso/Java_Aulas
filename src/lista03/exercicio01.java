package lista03;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer numeros_positivos = 0;
        Integer numeros_negativos = 0;
        Integer numeros_pares = 0;
        Integer numeros_impaes = 0;

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            Integer numero = scanner.nextInt();

            if (numero >= 0 && numero % 2 == 0) {
                numeros_positivos += 1;
                numeros_pares += 1;
            } else if(numero % 2 != 0 && numero >= 0) {
                numeros_impaes += 1;
            }else{
                numeros_negativos += 1;
            }
        }

        System.out.println("O que você quer saber? \n 1-Numeros pares\n2-Numeros impares\n3-Numeros negativos\n4-numeros positivos\n5-Sair");
        Integer escolha = scanner.nextInt();

        switch(escolha){
            case 1:
                System.out.printf("A quantidade de numeros pares é de : %s" , numeros_pares);
                break;
            case 2:
                System.out.printf("A quantidade de numeros impares é de : %s" , numeros_impaes);
                break;
            case 3:
                System.out.printf("A quantidade de numeros negativos é de : %s" , numeros_negativos);
                break;
            case 4:
                System.out.printf("A quantidade de numeros de postivios é de : %s" , numeros_positivos);
                break;
            default:
                System.out.printf("Voce saiu");
                break;
        }

    }
}
