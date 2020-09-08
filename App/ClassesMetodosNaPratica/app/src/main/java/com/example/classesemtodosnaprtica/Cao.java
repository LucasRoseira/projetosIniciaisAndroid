package com.example.classesemtodosnaprtica;

class Cao extends Animal{
    void latir() {
        System.out.println("Latir");
    }
    //Sobrescrever o método
    void correr(){
        super.correr();
        System.out.println("Correr como um cão");
    }
}
