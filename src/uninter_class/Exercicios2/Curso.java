package uninter_class.Exercicios2;

public class Curso {
    String nome;
    double mensalidade;

    public Curso(String nome, double mensalidade){
        super();
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    void info(){
        System.out.println("Nome Curso" + nome);
        System.out.println("mensalidade curso" + mensalidade);
    }

}
