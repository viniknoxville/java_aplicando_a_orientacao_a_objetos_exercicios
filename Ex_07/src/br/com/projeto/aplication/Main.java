package br.com.projeto.aplication;

import br.com.projeto.model.IdadePessoa;

public class Main {
    public static void main(String[] args) {

        IdadePessoa idade = new IdadePessoa();
        idade.setNome("Marcos");
        idade.setIdade(33);

        IdadePessoa  idade2 = new IdadePessoa();
        idade2.setNome("Ravi");
        idade2.setIdade(1);

        System.out.println("Nome: " + idade.getNome());
        System.out.println("Idade: " + idade.getIdade() + " anos.");
        idade.verificarIdade();

        System.out.println("\nNome: " + idade2.getNome());
        System.out.println("Idade: " + idade2.getIdade() + " anos.");
        idade2.verificarIdade();
    }
}
