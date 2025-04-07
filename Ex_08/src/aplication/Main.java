package aplication;

import model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Celular Teste");
        produto.setPreco(549.50);

        System.out.println("-----Promoção-----");
        System.out.println("Item: " + produto.getNome());
        System.out.println("De: " + produto.getPreco());

        produto.aplicarDesconto(15);
        System.out.println("Por: " + produto.getPreco());
    }
}
