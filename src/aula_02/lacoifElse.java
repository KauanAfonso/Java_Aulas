package aula_02;

public class lacoifElse{

    public static void main(String[] args){

        double media = 1.0;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        // AND (&&) - falso
        // OR (||) - verdadeiro
        // NOT (!) - FALSO

        if (media >= 5.0 && faltas < 25 && postura == true) {
            situacao = "Aprovado";
        } else if (media >= 5.0 && faltas < 20 && postura) {
            situacao = "Reprovado";  // Alterei aqui para algo mais lógico
        } else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Sem férias";
        } else if (media < 5.0 && faltas < 25 && postura == false) {
            situacao = "Chamar para conversar";
        } else {
            situacao = "Reprovado";

        }

        System.out.println(situacao);
    }
}
