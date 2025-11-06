package uninter_class.Exercicios1;

import uninter_class.empresa.Aluno;

public class Main {
    public static void main(String[] args) {
        Student kauan = new Student("Kauan", new Assesment(10,8,7));;
        kauan.info();

        BankAccount conta_kauan = new BankAccount(123456,"Kauan", 20, 300);
        conta_kauan.deposite_money(800);
        conta_kauan.whitdraw_money(500);
        conta_kauan.invoice();
    }

}
