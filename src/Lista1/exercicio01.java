package Lista1;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua data de nascimento");
        String data_aniversario = input.nextLine();

        System.out.println("Qual sua pretenção salarial");
        Double salario = input.nextDouble();

        System.out.println("Qual seu grau de instrução");
        String grau_instrucao = input.nextLine();

        System.out.println("Possui CNH? S/N");
        String cnh = input.nextLine();

        System.out.printf("Nome: %s \n data_aniversario: %s \n salario: %s \n Grau de instrução: %s \n CNH: %s \n" , nome, data_aniversario, salario, grau_instrucao, cnh);

    }


}
