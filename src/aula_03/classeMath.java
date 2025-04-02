package aula_03;

public class classeMath {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Operações Aritméticas: ");

        //soma
        System.out.println("Somoa: " + (a + b));

        //subtração
        System.out.println("Subtração: " + (a - b));

        //Multiplicação
        System.out.println("Multiplicação: " + (a * b));

        //divisão
        System.out.println("Divisão: " + (a / b));

        //resto de divisão
        System.out.println("Resto de divisão: " + (a % b));


        //funções da classe Math
        System.out.println("Funcções da classe Math: ");

        //Math.abs()
        System.out.println("O valor absoluto de -10: " + Math.abs(-10));

        //Math.pow()
        System.out.println("2 elevado á 3: " + Math.pow(2,3));

        //Math.sqrt
        System.out.println("Raiz quadrada de 16: " + Math.sqrt(16));

        //Math.max
        System.out.println("Maximo entre 10 e 5: " + Math.max(10,5));

        //Math.min()
        System.out.println("Mínimo entre 10 e 5: " + Math.min(10,5));

        //Math.random()
        System.out.println("Número aleatorio entre 0 e 1: " + Math.random());

        //Math.round()
        System.out.println("Arredondando de 3.6: " + Math.round(3.6));

        //Math.sin()
        System.out.println("Seno de 30 graus (em radianos): " + Math.sin(Math.toRadians(30)));

        //Mat.cos
        System.out.println("Cosseno de 30 graus (em radianos): " + Math.cos(Math.toRadians(30)));

        //Math.tan()
        System.out.println("Tangente de de 45 graus (em radianos): " + Math.tan(Math.toRadians(45)));

    }

}
