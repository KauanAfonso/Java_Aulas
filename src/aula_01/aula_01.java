package aula_01;

public class aula_01 {

    public static void main(String[] args) {


        String nome = "Gabriela Freitas Melo";
        int idade = 18;
        double altura = 2.05;
        double saldo = 1500.98765;
        double taxaDesconto = 0.15;
        int codigoProduto = 25;

        System.out.println();
        //Exemplo de uso  do print
        System.out.print("Olá! ");
        System.out.print("Este é o uso de print. ");
        System.out.print(" Ele não pula linha automaticamente.  ");

        System.out.println();
        //Exemplo de uso do println
        System.out.println("Agora estamos usando o println");
        System.out.println("Ele pula automaticamente  para a próxima linha");


        System.out.println();
        //Exemplo de de uso do printf com variaveis
        System.out.printf("Meu nome %s, tenho %d anos e minha altura %.2f metros.\n", nome, idade, altura);
        //%s para String(nome), %d para inteiro(idade), %.2f para decimal com 2 casas(altura)


        System.out.println();
        //Exemplo de saldo bancário com duas e três casas decimais
        System.out.printf("Saldo bancário com duas casas decimais: R$%.2f\n", saldo);// com 2 casas
        System.out.printf("Saldo bancário com três casas decimais: R$%.3f\n", saldo);// com 3 casas

        //alinhamento com printf: Nome e idade em colunas
        System.out.printf("%-10s %10s\n", "Nome" , "idade");
        System.out.printf("%-10s %10s\n", nome , idade);
        //%10s alinha á esquerda com 10 espaços e %10 alinha a direita com 10 espaços

        System.out.printf("Taxa de desconto: %.0f\n", taxaDesconto);
        System.out.printf("Taxa de desconto: %.0f\n", taxaDesconto * 100);

        System.out.printf("Código do produto: %05d\n", codigoProduto);

        String item1 = "Café";
        double preco1 = 5.50;
        String item2 = "Sanduiche";
        double preco2 = 12.30;
        String item3 = "Suco";
        double preco3 = 8.70;

        System.out.printf("%-10s %10s\n", "Item", "Preço");
        System.out.printf("%-10s R$%10.2f\n",item1, preco1);
        System.out.printf("%-10s R$%10.2f\n", item2, preco2);
        System.out.printf("%-10s R$%10.2f\n", item3, preco3);
        //%-10s alinha o nome do item a esquerda, e o %10.2f alinha o preço a direita com duas casas decimais


    }

}
