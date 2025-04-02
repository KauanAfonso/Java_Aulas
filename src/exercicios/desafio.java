package exercicios;

public class desafio {
    public static void main(String[] args) {

        double fracao = -3.0/4;

        double conta_parte_de_cima = ( 3 * Math.pow(fracao, -2)) + (6 * (Math.pow(3,-1)/4) - 4);
        double conta_parte_de_baixo = 7 * Math.pow(fracao, -1) + 2;
        double conta_divisao = conta_parte_de_cima / conta_parte_de_baixo;
        double final_conta = Math.pow(conta_divisao, -1) + 4;

        System.out.println(final_conta);


    }
}
