package com.example.classesemtodosnaprtica;

public class Lucas extends Cidadao implements Presidente{
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar eleição no Brasil");
    }
    /*
    * ####### INTERFACE ####
    * Pode-se dizer a grosso modo, que uma interface é um contrato que
    * quando assumido por uma classe, deve ser implementado
    *
    * Interface é utilizada pois podemos ter muitos objetos(classes)
    * que podem possuir a mesma ação(métodos), porém podem
    * executá-las de maneiras diferentes.
    *  */


}
