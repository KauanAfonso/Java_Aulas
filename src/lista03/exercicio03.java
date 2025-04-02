package lista03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer participantes = 0;
        Integer Otimo = 0;
        Integer Bom = 0;
        Integer ruim = 0;
        Integer escolha = 0;

        do {
            System.out.println("Responda:\n 1-Otimo\n 2-Bom \n 3-Ruim \n 4-Sair\n");
            escolha = scanner.nextInt();

            if (escolha <= 3 && escolha >0) {
                participantes+=1;

                if (escolha == 1) {
                    Otimo += 1;
                } else if (escolha == 2) {
                    Bom += 1;
                }else{
                    ruim += 1;
                }
            }

        }while(escolha <= 3 && escolha >0);

        //porcentagem
        Integer escolha_bom = (Bom * 100 ) / participantes;
        Integer escolha_Otimo = (Otimo * 100 ) / participantes;
        Integer escolha_ruim = (ruim * 100 ) / participantes;

        System.out.printf("%s pessoas escolheram otimo e isso representa %s %% \n" , Otimo, escolha_Otimo);
        System.out.printf("%s pessoas escolheram bom e isso representa %s %% \n" , Bom, escolha_bom);
        System.out.printf("%s pessoas escolheram ruim e isso representa %s %% \n" ,ruim, escolha_ruim);

        //não da para fazer a media
        System.out.printf("Média geral das escolhas: %.2f\n", (double) (Otimo) / participantes);



    }
}
