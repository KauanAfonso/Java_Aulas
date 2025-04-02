package lista03;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double altura;
        double peso;
        String nome_altura = " ";
        String nome_peso = " ";


        double altura_mais_alta = 0.0;
        double peso_mais_alta = 0.0;

        for (int i = 0; i < 2; i++) {

            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            System.out.println("Digite sua altura: ");
            altura = scanner.nextDouble();
            System.out.println("Digite seu peso: ");
            peso = scanner.nextDouble();


            if(altura > altura_mais_alta){
                altura_mais_alta = altura;
                nome_altura = nome;
            }

            if(peso > peso_mais_alta){
                peso_mais_alta = peso;
                nome_peso = nome;
            }
        }


        System.out.printf("O %s é o mais alto com %s\n O %s é o mais pesado com %s KG " ,  nome_altura, altura_mais_alta, nome_peso, peso_mais_alta);

    }
}
