package Vetores_e_Matriz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores{


    public static void main(String[] args) {

        //Criando um vetor ( array de números inteiros )
        int[] numeros = new int[5];

        //colocando numeros dentro das "caixas"
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[4] = 40;

        //percorrendo a fila e mostrnado os números
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Caixa " + i + " tem: " + numeros[i]);
        }

        System.out.println(Arrays.toString(numeros));


    }




}
