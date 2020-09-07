package com.example.classesemtodosnaprtica;

public class Pessoa {
    private String nome;
    private int idade;
    //Sobrecarga de método é utilizar o mesmo nome método mas com parâmetros diferentes
    public void exibirDados(String nome) {
        System.out.println("Exibir apenas nome: " + nome);
    }

    public void exibirDados(String nome, int idade) {
        System.out.println("Nome: " + nome + "Idade: " + idade);
    }
}
