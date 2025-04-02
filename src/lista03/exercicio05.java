package lista03;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int qtd_pessoas = 0;
        int saldo_bom = 0;
        int saldo_ruim = 0;
        int escolha;

        while(true){
            System.out.println("Digite 1 para informar os dados ou 2 para sair");
            escolha = scanner.nextInt();
            if(escolha == 1){

                System.out.println("Digite seu saldo");
                saldo = scanner.nextDouble();
                qtd_pessoas+=1;

                if(saldo >= 0){
                    saldo_bom+=1;
                }else{
                    saldo_ruim+=1;
                }

            }else{
                System.out.println("Voce saiu ....");
                break;
            }

        }

        if(saldo_bom >= (qtd_pessoas / 2)){
            System.out.println("Nenhum risco");
        }else{
            System.out.println("Risco ao banco");
        }

    }


}
