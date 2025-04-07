package aplication;

import model.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Titulo: teste 1","Marcos R. Santos");
        Livro livro2 = new Livro("Titulo: teste 2","Fernando Santos");
        Livro livro3 = new Livro("Titulo: teste 3","Bruna Mendes");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();

    }
}
