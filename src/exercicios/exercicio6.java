package exercicios;

public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("-----------------Expressão de segundo grau-----------------------");

        double a = 1;
        double b = 12;
        double c = -13;

        double delta = Math.pow(b,2) - 4*a*c;

        double baskara_positivo = (-b + Math.sqrt(delta) ) / 2 * a;
        double baskara_negativo = (-b - Math.sqrt(delta) ) / 2 * a;

        System.out.println("Saída positiva: " + baskara_positivo  + " Saída Negativa: " + baskara_negativo);

    }
}
