package com.example.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.edtNome);
        campoEmail = findViewById(R.id.edtEmail);
        textoResultado = findViewById(R.id.txtResultado);

    }

    public void enviar(View view) {

        String nome = campoNome.getText().toString();
        String email = campoNome.getText().toString();

        textoResultado.setText("Nome:" + nome + " Email: " + email);

    }

    public void limpar(View view    ) {
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
    }
}