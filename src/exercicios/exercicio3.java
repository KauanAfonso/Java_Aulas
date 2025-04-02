package exercicios;

public class exercicio3 {
    public static void main(String[] args) {

        double peso = 500.5;
        double altura = 1.85;

        double imc = peso / Math.pow(altura,2);

        if (imc >= 18.5 && imc <= 24.4) {
            System.out.println("Normal");
        }else if (imc >= 25.0 && imc <=29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade Grave");
        }

    }
}
