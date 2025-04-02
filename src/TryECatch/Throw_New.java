package TryECatch;

import java.util.Scanner;

public class Throw_New {

    public static void main(String[] args) {
        Scanner Kauan = new Scanner(System.in);

        try{
            System.out.println("Digite sua idade: ");
            int idade = Kauan.nextInt();

            if(idade < 18){
                throw new IllegalArgumentException("Erro: Idade mínima é de 18 anos");

            }
            System.out.println("Cadastro realizado com sucesso! ");
        }catch (IllegalArgumentException e){
            System.out.println("Execução capturada: " + e.getMessage());
        }finally{
            Kauan.close();
            System.out.println("Programa finalizado!");
        }
    }

}
