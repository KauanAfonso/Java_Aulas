package TryECatch;

import java.util.Scanner;

public class Try_e_Catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Nao é possivel dividir por zero!");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida Certifique-se de inserir números inteiros! ");
        } finally {
            scanner.close();
            System.out.println("P r o g r a m a Finalizado!");
        }
    }
        public static int dividir(int a, int b){
                return a / b;
        }
    }

