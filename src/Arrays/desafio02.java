package Arrays;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class desafio02 {

    public static void main(String[] args) {
        ArrayList<String> todos_os_nomes = new ArrayList<>();
        ArrayList<String> rodada_nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String escolha;
        Integer contador_nome;
        String palavra_normalizada = "";

        ExecutorService executor = Executors.newSingleThreadExecutor(); //Rodar uma thread separada
        String jogar_novamente = "S";

        while (jogar_novamente.equals("S")) {
            ArrayList<String> nomes = new ArrayList<String>(); //lista para todos os
            ArrayList<Integer> quantidade = new ArrayList<Integer>(); //quantidade de vezes na qual o nome foi enviado
            ArrayList<String> nomes_unicos = new ArrayList<String>(); //lista de nomes unicos
            //Escolha do usuario
            do {
                try {
                    System.out.println("\nDigite um nome para a lista ou -1 para sair, (voce tem 5 segundos)\n");
                    //Mostrar_tempo(); //chamando minha função
                    Future<String> future = executor.submit(() -> scanner.next());//lança um scanner em uma thread separada
                    escolha = future.get(5, TimeUnit.SECONDS).toLowerCase(); //tenta pegar o scanner digitado em 1 segundo
                    palavra_normalizada = Normalizer.normalize(escolha, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

                    //usuario escolheu sair
                    if (palavra_normalizada.equals("-1")) {
                        break;
                    }

                    nomes.add(palavra_normalizada); //adicionando nome que o usuario digitou em nome
                } catch (TimeoutException e) {
                    System.out.println("\n\nTEMPO ESGOTADOOOOOOOO!!!!!!!\n");
                    System.out.println("Programa finalizado...");
                    break;
                } catch (Exception e) {
                    System.out.println("Algum erro: " + e.getMessage());
                }

            } while (!palavra_normalizada.equals("-1")); //Enquanto o usuario não manda '-1'

            //for para percorrer a lista de nomes
            for (int i = 0; i < nomes.size(); i++) {

                String nome_atual = nomes.get(i);//pegando o nome_atual
                contador_nome = 0; //contador_nome recebe 0
                boolean nome_contado = false; //nome contado -> para verificar se o nome ja foi contado

                //For Each -> para verificar se o nome_atual
                //já foi contado (ou seja ele está presente em arr(nomes_unicos))
                for (String nome : nomes_unicos) {
                    if (nome.equals(nome_atual)) {
                        nome_contado = true; //recebe True pois foi encontrado;
                        break; //sai do lopp
                    }
                }
                //se for falso -> siginifica que nome ainda não foi encontrado
                if (!nome_contado) {
                    for (String nome : nomes) {
                        if (nome.equals(nome_atual)) { //se nome for igual o nome atual
                            contador_nome += 1; //atribua mais um em contador_nome
                        }
                    }

                    quantidade.add(contador_nome); //adiciona a quantidade do nome_atual à quantidade
                    nomes_unicos.add(nome_atual); // add o nome atual a nomes_unicos


                }
            }
            System.out.println("Nomes digitados: " + nomes_unicos);
            System.out.println("Quantidade digitadas:" + quantidade);
            System.out.println("Deseja jogar novamente? ");
            jogar_novamente = scanner.next();
            if(jogar_novamente.equals("N")){
                break;
            }
        }
    }
    //metodo para mostrar o tempo na tela
    public static void Mostrar_tempo(){
        for (int i = 5; i >0; i--) {
            System.out.println(i + "-");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("ERRO: " + e);
            }

        }
    }

}

