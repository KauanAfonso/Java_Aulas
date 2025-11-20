package uninter_class.Exercicios2;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mario", 11, 0.1, new Curso("Engenharia", 1200));

        a1.info();
        System.out.println("Pagamento: " + a1.pagamento());
    }
}
