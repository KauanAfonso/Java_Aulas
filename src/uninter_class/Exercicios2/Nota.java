package uninter_class.Exercicios2;

public class Nota {

    private double nota1;
    private double nota2;
    private int faltas;

    public  Nota(double nota1, double nota2, int quantidade_f){
        setNota1(nota1);
        setNota2(nota2);
        setFalta(quantidade_f);
    }

    public void setNota1(double nota){
        this.nota1 = nota;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public void setFalta(int falta){
        this.faltas = falta;
    }

    public int getFaltas(){
        return this.faltas;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    void resultado(){
        double media = (nota1 / nota2)/2;

        if(media < 5 || this.faltas <= 7){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }
}
