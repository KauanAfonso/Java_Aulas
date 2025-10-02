package Getters_Setters;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome,double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    //gettrs

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return  this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

    public boolean getDisponibilidade(){
        return this.quantidade > 0;
    }

}
