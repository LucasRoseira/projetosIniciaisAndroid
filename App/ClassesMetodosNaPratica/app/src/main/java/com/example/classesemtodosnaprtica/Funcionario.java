package com.example.classesemtodosnaprtica;

class Funcionario {
    //Proriedades
    String nome;
    double salario;
    //Métodos - Sem retorno /Com retorno
        double recuperarSalario (double bonus, double descontoAdicional){
        this.salario -= this.salario * 0.1;
        //System.out.println(this.salario);
        return this.salario + bonus - descontoAdicional;
    }
}
