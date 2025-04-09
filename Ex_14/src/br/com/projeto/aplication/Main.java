package br.com.projeto.aplication;

import br.com.projeto.model.GeradorPrimo;
import br.com.projeto.model.NumerosPrimos;
import br.com.projeto.model.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
