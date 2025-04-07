package aplication;

import model.Aluno;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcos", 7, 8.5 ,6.5);
        Aluno aluno2 = new Aluno("Marcelo", 2, 7.5 ,3);

        System.out.println("------Notas------");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Av1: " + aluno1.getNota1());
        System.out.println("Av2: " + aluno1.getNota2());
        System.out.println("Av3: " + aluno1.getNota3());
        System.out.println("Média: " + String.format("%.1f",aluno1.calcularMedia()));

        System.out.println();

        System.out.println("------Notas------");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Av1: " + aluno2.getNota1());
        System.out.println("Av2: " + aluno2.getNota2());
        System.out.println("Av3: " + aluno2.getNota3());
        System.out.printf("Média: %.1f%n",aluno2.calcularMedia());
    }
}
