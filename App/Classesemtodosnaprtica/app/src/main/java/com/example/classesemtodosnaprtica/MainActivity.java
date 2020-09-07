package com.example.classesemtodosnaprtica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

//Herdando recursos de AppCompactivity
public class MainActivity extends AppCompatActivity {

    @Override

    //onCreate é o método dentro da classe mainActivity que é sempre chamado
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados( "Lucas");
        pessoa.exibirDados("Lucas Gomes", 42);

        ContaBancaria contaBancaria = new ContaBancaria();
        ContaBancaria contaBancariaComParametro = new ContaBancaria(100057);

        Obama obama = new Obama();
        obama.direitosDeveres();
        /*
        Conta conta = new Conta();
        conta.depositar(100); //200
        conta.numeroDaConta = 5;
        conta.sacar(50);
        conta.recuperarSaldo();
        //conta.saldo = 0;
        System.out.println(conta.recuperarSaldo());

        Animal animal = new Animal();
        animal.cor =  "blue";
        */
        /*
        Animal animal = new Animal();
        animal.correr();

        Cao cao = new Cao();
        cao.correr();
       // cao.setCor("Vermelho");
        System.out.println(cao.getCor());
        Passaro passaro = new Passaro();
        passaro.dormir();
        passaro.correr();
        /*
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas Gomes";
        //Métodos sem retorno
        funcionario.salario = 3.500;
        //funcionario.recuperarSalario();
         */

        /* double salarioRecuperado = funcionario.recuperarSalario(150, 20);
        System.out.println("O salário é: " + salarioRecuperado);
           */


        /*Instanciando objeto casa
        Casa minhaCasa = new Casa();
        Casa minhaCasa2;
        minhaCasa2 = new Casa();
        minhaCasa.abrirPorta();
        minhaCasa.cor = "yellow";
         */

    }
}