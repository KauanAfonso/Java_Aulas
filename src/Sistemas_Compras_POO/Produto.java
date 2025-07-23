package Sistemas_Compras_POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Produto {
    private String nome;
    private Float preco;
    private int quantidade;

    private static  Map<String, Produto> lista_produtos = new HashMap<>();

    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void criar_produto(Produto produto){

        lista_produtos.put(produto.nome, produto);
        System.out.println("Produto criado com sucesso !");
    }

    public String getNome(){
        return  this.nome;
    }

    public Float getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    void exibirInf() {
        lista_produtos.forEach((chave, valor) -> {
            System.out.printf("Produto: %s - R$ %.2f - Quantidade: %d\n",
                    valor.getNome(),
                    valor.getPreco(),
                    valor.getQuantidade());
        });
    }


}
