package Getters_Setters;

public class Main3 {
    public static void main(String[] args) {

        Produto produto = new Produto("Furadeira Top10", 100,30);

        System.out.printf("Temos uma quantidade de %d %s cada uma ao preço de %.2f reais\n",
                produto.getQuantidade(),
                produto.getNome(),produto.getPreco());

        //verifica a disponibilidade
        if(produto.getDisponibilidade()){
            System.out.println("Produto disponível em estoque!");
        }else{
            System.out.println("Produto esgotado !");
        }

        //Altera a quantidade do produto com o Setter
        produto.setQuantidade(10);
        System.out.printf("\nApós atualização , restam %d unidades de %s. \n",
                produto.getQuantidade(),
                produto.getNome());

        //zero o estoque (produto vendido)
        produto.setQuantidade(0);
        System.out.printf("\nApós zerar, restam %d unidades de %s. \n",
                produto.getQuantidade(),
                produto.getNome());

        //verifica novamente a disponibilidade

        if(produto.getDisponibilidade()){
            System.out.println("Produto disponível em estoque !");
        }else{
            System.out.println("Produto esgotado!");
        }

        //testando o setter com valor inválido
        produto.setQuantidade(-5);
        System.out.printf("\n Tentando setar quantidade negativa...\nEstoque atual: %d unidades. \n",
                produto.getQuantidade());

    }


}
