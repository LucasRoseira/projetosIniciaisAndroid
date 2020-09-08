package com.example.classesemtodosnaprtica;

class Animal  {
    int tamanho;
    protected String cor;
    double peso;
    //Getters and Setters

    public void setCor(String cor) {
        //Formatação ou validação
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    void dormir () {

        System.out.println("Dormir como um animal");
    }
    void correr () {
        System.out.println("Dormir como um animal");
    }
}
