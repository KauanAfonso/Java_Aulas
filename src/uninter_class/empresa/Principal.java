package uninter_class.empresa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Alo mamae");
        Aluno a = new Aluno(1001, "Kauan", "45655489-5");
        a.info();

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(a);

    }
}
