package lista2;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double valor_base = 3000.00;

        System.out.println("Qual o seu destino digite?\n 1-Maceió\n 2-Porto de galinhas");
        Integer destino = input.nextInt();

        System.out.println("Com almoço/janta inclusivo\n? 1-Sim\n 2-Não");
        Integer comida = input.nextInt();

        if(destino == 1 && comida == 1){
            System.out.printf("O valor é de:  %s"  , 2*valor_base);
        } else if (destino == 1 && comida == 2) {
            System.out.printf("O valor é de:  %s" , valor_base + (valor_base * 85)/ 100);
        } else if (destino == 2 && comida == 1) {
            System.out.printf("O valor é de:  %s" , valor_base + (valor_base * 60)/ 100);
        }else{
            System.out.printf("O valor é de:  %s" , valor_base + (valor_base * 45)/ 100);
        }


    }
}
