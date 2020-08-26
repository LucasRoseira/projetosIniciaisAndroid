package com.example.classesemtodosnaprtica;

class Passaro extends Animal{
    void voar () {
        System.out.println("Voar");
    }
    void correr(){
        super.correr();
        System.out.println("Correr como um cão");
    }
}
