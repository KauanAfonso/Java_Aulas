package lista2;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade: ");
        Integer idade = input.nextInt();

        if(idade >= 0 && idade <=14){
            System.out.println("Criança");
        } else if (idade >= 15 && idade <=17) {
            System.out.println("Adolescente");
        } else if (idade >=18 && idade <= 30) {
            System.out.println("Adulto jovem");
        }else{
            System.out.println("Adulto");
        }

    }

}
