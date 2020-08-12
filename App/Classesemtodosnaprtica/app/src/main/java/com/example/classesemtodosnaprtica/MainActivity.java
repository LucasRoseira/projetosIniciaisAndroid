package com.example.classesemtodosnaprtica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    //onCreate é o método dentro da classe mainActivity que é sempre chamado
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instanciando objeto casa
        Casa minhaCasa = new Casa();
        Casa minhaCasa2;
        minhaCasa2 = new Casa();
        minhaCasa.abrirPorta();
        minhaCasa.cor = "yellow";

    }
}