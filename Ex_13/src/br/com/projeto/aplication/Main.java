package br.com.projeto.aplication;

import br.com.projeto.model.ContaBancaria;
import br.com.projeto.model.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(5000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(6000);
        contaCorrente.consultarSaldo();
    }
}
