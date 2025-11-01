package uninter_class.Reverso;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite  a quantidade de nomes: ");
        int qtd = teclado.nextInt();

        String nome;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite um nome: ");
            nome = teclado.next();
            listaNomes.add(nome);
        }

        //Ou usar colletions.reverse()
        for (int i = listaNomes.size() -1; i >= 0; i--) {
            System.out.println(listaNomes.get(i));
        }
    }
}
