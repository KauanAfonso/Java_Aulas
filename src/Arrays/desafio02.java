package Arrays;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class desafio02 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> rodadas = new ArrayList<>(); //variavel que recberá os nomes por rodadas
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
                    Future<String> future = executor.submit(() -> {
                        if (scanner.hasNextLine()){
                            return scanner.nextLine();//lança um scanner em uma thread separada
                        }
                        return null;
                    });
                    escolha = future.get(5, TimeUnit.SECONDS).toLowerCase(); //tenta pegar o scanner digitado em 1 segundo
                    if (escolha == null) {
                        palavra_normalizada = "";
                    } else {
                        palavra_normalizada = Normalizer.normalize(escolha, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
                    }

                    if (palavra_normalizada.equals("-1")) {
                        break;
                    }

                    //usuario escolheu sair
                    if (!palavra_normalizada.isEmpty()) {
                        nomes.add(palavra_normalizada);
                    }

                } catch (TimeoutException e){
                    System.out.println("\n\nTEMPO ESGOTADOOOOOOOO!!!!!!!\n");
                    System.out.println("Programa finalizado...");
                    jogar_novamente = "N"; // Força encerramento do jogo
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
            rodadas.add(new ArrayList<>(nomes_unicos)); // Salva os nomes únicos dessa rodada
            System.out.println("Quantidade digitadas:" + quantidade);

            // Pergunta se quer jogar novamente, só se não houve timeout
            if (!jogar_novamente.equalsIgnoreCase("N")) {
                System.out.println("Deseja jogar novamente? (S/N)");

                if (scanner.hasNextLine()) {
                    jogar_novamente = scanner.nextLine().trim().toUpperCase();
                } else {
                    jogar_novamente = "N"; // Encerra se não houver mais entrada
                }
            }
        }
        scanner.close();
        executor.shutdownNow();
        //Printando nomes por rodada
        System.out.println("\nResumo das rodadas:");
        for (int i = 0; i < rodadas.size(); i++) {
            System.out.println("Rodada " + (i + 1) + ": " + rodadas.get(i));
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

