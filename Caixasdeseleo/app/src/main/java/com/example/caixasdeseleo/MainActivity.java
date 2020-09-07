package com.example.caixasdeseleo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.edtNome);
        campoEmail      = findViewById(R.id.edtEmail);
        textoResultado  = findViewById(R.id.txtResultado);

        //CheckBox
        checkBranco     = findViewById(R.id.checkBranco);
        checkVerde      = findViewById(R.id.checkVerde);
        checkVermelho   = findViewById(R.id.checkVermelho);
    }
    public void checkBox() {
        String texto = "";
        if(checkVerde.isChecked()) {
            //String corSelecionada = checkVerde.getText().toString();
            texto = "Verde selecionado -";
        }
        else if(checkBranco.isChecked()) {
            texto += "Branco selecionado -";
        }
        else if(checkVermelho.isChecked()) {
            texto += "Vermelho selecionado ";
        }

      textoResultado.setText(texto);

    }
    public void enviar(View view) {
        checkBox();
    }

    public void limpar(View view    ) {
        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
    }
}