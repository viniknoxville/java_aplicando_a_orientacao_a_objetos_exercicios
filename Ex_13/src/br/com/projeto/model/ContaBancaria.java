package br.com.projeto.model;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado R$:" + valor + "\n" + "Saldo atual R$:" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Valor sacado R$: " + valor + "\n" + "Saldo atual R$:" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo R$:" + saldo);
    }
}

