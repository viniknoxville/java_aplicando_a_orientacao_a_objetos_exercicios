package br.com.projeto.model;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(" miau, miau...");
    }

    public void arranhaMoveis() {
        System.out.println("Gato arranha móveis!!!");
    }
}
