package com.example.primeiroappdesenvolvimentoandroidcompleto;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view) {
        //Encontrar o componente pelo findViewById
        TextView texto = findViewById(R.id.textoExibicao);
        texto.setText("Lucas Gomes");
    }
}
