package br.com.projeto.aplication;

import br.com.projeto.model.ModeloCarro;

public class Main {

    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPreco(50000, 45000, 35000);
        meuCarro.exibirInfo();
    }
}

