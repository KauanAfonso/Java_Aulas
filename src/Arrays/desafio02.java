package Arrays;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;

public class desafio02 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>(); //lista para todos os nomes
        ArrayList<Integer> quantidade = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes_unicos = new ArrayList<String>(); //lista de nomes unicos
        String escolha;
        Integer contador_nome;
        String palavra_normalizada = "teste";
        long time = System.currentTimeMillis();
        long future_time = (int) (time + 10);

        //Escolha do usuario
        do {
            for (int i = Math.toIntExact(future_time); i < time ; i-=1) {
                System.out.println("Digite um nome para a lista ou -1 para sair");

                escolha = scanner.next().toLowerCase();
                palavra_normalizada = Normalizer.normalize(escolha, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");


                if(palavra_normalizada.equals("-1")){
                    break;
                }
                nomes.add(palavra_normalizada); //adicionando nome que o usuario digitou em nomes
                System.out.println(i);
            }

        }while(!palavra_normalizada.equals("-1")); //Enquanto o usuario não manda '-1'


        //for para percorrer a lista de nomes
        for(int i = 0; i < nomes.size(); i++) {

            String nome_atual = nomes.get(i);//pegando o nome_atual
            contador_nome = 0; //contador_nome recebe 0
            boolean nome_contado = false; //nome contado -> para verificar se o nome ja foi contado

            //For Each -> para verificar se o nome_atual
            //já foi contado (ou seja ele está presente em arr(nomes_unicos))
            for (String nome: nomes_unicos){
                if(nome.equals(nome_atual)){
                    nome_contado = true; //recebe True pois foi encontrado;
                    break; //sai do lopp
                }

            }

            //se for falso -> siginifica que nome ainda não foi encontrado
            if(!nome_contado){
                for(String nome: nomes){
                    if(nome.equals(nome_atual)){ //se nome for igual o nome atual
                        contador_nome+=1; //atribua mais um em contador_nome
                    }
                }

                quantidade.add(contador_nome); //adiciona a quantidade do nome_atual à quantidade
                nomes_unicos.add(nome_atual); // add o nome atual a nomes_unicos

            }
        }

        System.out.println("Nomes digitados: "+ nomes_unicos);
        System.out.println("Quantidade digitadas:" + quantidade);
    }

}
