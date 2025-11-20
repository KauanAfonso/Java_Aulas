package uninter_class.Exercicios2;

public class Aluno {
    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso){
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    void info(){
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("matricula: " + this.matricula);
        System.out.println("desconto:" + this.desconto);
        curso.info();
    }

    double pagamento(){
        return curso.mensalidade*(1-this.desconto);
    }
}
