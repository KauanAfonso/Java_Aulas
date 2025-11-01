package uninter_class.Leonidas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int palpite;
        int valor_correto = 100;
        System.out.println("Digite seu palpite: ");
        palpite = teclado.nextInt();
        String msg;

        while(palpite != valor_correto){
            /*
            if(palpite > valor_correto){
                System.out.println("Um pouco menos...");
            }else{
                System.out.println("Um pouco mais");
            }*/

            msg = palpite>valor_correto?"Um pouco menos ...":"Um pouco mais...";
            System.out.println(msg);
            System.out.println("Digite seu palpite: ");
            palpite = teclado.nextInt();
        }

        System.out.println("Parabéns você acertou!");
    }
}
