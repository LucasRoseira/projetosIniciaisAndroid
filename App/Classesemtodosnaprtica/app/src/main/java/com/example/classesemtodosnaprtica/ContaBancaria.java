package com.example.classesemtodosnaprtica;

//Padrão CamelCase
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    //Construtor tem que sempre ter o nome da classe
    public ContaBancaria() {
        System.out.println("Configurações Iniciais");
    }

    //Assinatura do método é composta pelo nome e pelos parâmetros
    public ContaBancaria(int nConta) {
        this.numeroConta = nConta;
        System.out.println("Construtor Chamado" + nConta);
    }
}
