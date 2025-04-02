package TryECatch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //valor total do produto vs qtd
        double valor_total = 0;

        //Arrays que serão utilizados par armazenar dados
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer>qtd = new ArrayList<>();
        ArrayList<Float>preco = new ArrayList<>();

        //quantidade de produtos que deverão ser cadastrados no array
        int qtd_array_produtos = 5;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular estoque de 5 produtos");

        //inicializando as variaveis que logo farão a entrada de dados
        String nome_produto;
        float preco_produto;
        int qtd_produto;


        //For para adicionar produtos enquanto for menor e igual a quantidade de produtos cadastrados
        //e addicionando cada informação em seu devido array
        for(int i = 1; i <= qtd_array_produtos; i++) {

                System.out.println("Digite o nome do produto:");
                nome_produto =  scanner.next();
                nomes.add(nome_produto);

                System.out.println("Digite o preço do produto:");
                preco_produto = scanner.nextFloat();
                preco.add(preco_produto);

                System.out.println("Digite a quantidade do produto:");
                qtd_produto = scanner.nextInt();
                qtd.add(qtd_produto);
        }


        //For que roda enquanto for menor que a qtd de produtos no array pegando os devidos dados e retornando
        for(int i = 0; i < qtd_array_produtos; i++) {

            valor_total = qtd.get(i) * preco.get(i); //valor total que pega quantidade e valor do produto
            System.out.printf("O nome do produto é %s, seu valor unitário é de %.2f e seu é quantidade %d e o valor total é de R$: %.2f\n", nomes.get(i), preco.get(i), qtd.get(i), valor_total);


        }

    }
}
