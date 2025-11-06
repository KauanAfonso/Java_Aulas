package uninter_class.Exercicios1;

public class Student {
    String nome;
    Assesment assesments;

    Student(String nome, Assesment assesment){
        this.nome = nome;
        this.assesments = assesment;
    }

    void info(){
    System.out.println("nome: " + this.nome);
    System.out.println("Média aritimética:" + this.assesments.arithmetic_avarage());
    System.out.println("Média ponderada:" + this.assesments.wheighted_avarage());
    }
}
