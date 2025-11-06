package uninter_class.Exercicios1;

public class Assesment {
    double nota1;
    double nota2;
    double nota3;

    Assesment(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double arithmetic_avarage(){
       double avg = (this.nota1 + this.nota2 + this.nota3)/ 3;
       return avg;
    };

    double wheighted_avarage(){
       return (this.nota1 * 2 + this.nota2 * 3 + this.nota3 * 4)/9;
    }
}
