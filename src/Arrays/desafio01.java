package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class desafio01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> quantidade = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        String escolha;

        do {
            System.out.println("Digite um nome para a lista ou -1 para sair");
            escolha = scanner.next();

            if(escolha == "-1"){
                break;
            }
            nomes.add(escolha);

            //Com dois For's talvez sja possivel
            for (int i = 0; i < nomes.size(); i++) {

                for (int j = 0; j < nomes.size(); j++) {
                    boolean verificar_nome = false;
                    if(nomes.get(j) == escolha){
                        nomes.add(escolha);
                        verificar_nome = true;
                    }

                }

            }




        }while (!escolha.equals("-1"));

        System.out.println(nomes);
    }
}
