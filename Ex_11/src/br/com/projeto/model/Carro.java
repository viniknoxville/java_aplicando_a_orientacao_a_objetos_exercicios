package br.com.projeto.model;

import com.sun.source.tree.BreakTree;

public class Carro {
    private String modelo;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPreco (double valorAno1, double valorAno2, double valorAno3) {
        this.valorAno1 = valorAno1;
        this.valorAno2 = valorAno2;
        this.valorAno3 = valorAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + valorAno1);
        System.out.println("Preço Ano 2: " + valorAno2);
        System.out.println("Preço Ano 3: " + valorAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    private double calcularMenorPreco(){
        double menorPreco = valorAno1;

        if (valorAno2 < valorAno1){
            menorPreco = valorAno2;
        }
        if (valorAno3 < valorAno1) {
            menorPreco = valorAno3;
        }
        return menorPreco;
    }

    private double calcularMaiorPreco (){
        double maiorPreco = valorAno1;

        if (valorAno2 > valorAno1){
            maiorPreco = valorAno2;
        }
        if (valorAno3 > valorAno1){
            maiorPreco = valorAno1;
        }
        return maiorPreco;
    }


}
