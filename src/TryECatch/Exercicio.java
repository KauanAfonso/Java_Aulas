package TryECatch;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int numero1 = 0;
        int numero2 = 0;
        try{

            System.out.println("Digite o um número: ");
            numero1 = scanner.nextInt();

            System.out.println("Digite outro número: ");
            numero2 = scanner.nextInt();

            System.out.println("Digite um número para operação: \n1 - Divisão\n2 - Multiplicação\n3 - Soma\n4 - Subtração\n5 - Exponenciação");
            escolha = scanner.nextInt();

            int resultado = operacao(numero1,numero2,escolha);
            System.out.println("Calculo realizado: " + resultado);


        } catch (Exception e) {
            if(escolha == 1 && numero2 == 0){
                throw new IllegalArgumentException("Erro: Não pode dividir por zero.");
            }
            throw new IllegalArgumentException("Erro: Entrada inválida Certifique-se de inserir números inteiros! ");
        }finally {
            scanner.close();
            System.out.println("Programa finalizado..");
        }
    }

        public static int operacao(int numero1, int numero2, int escolha){
            switch (escolha){
                case 1:
                    return numero1 / numero2;
                case 2:
                    return numero1 * numero2;
                case 3:
                    return numero1+numero2;
                case 4:
                    return numero1 - numero2;
                case 5:
                    return (int) Math.pow(numero1,numero2);

            }

            return 0;
        }

    }

