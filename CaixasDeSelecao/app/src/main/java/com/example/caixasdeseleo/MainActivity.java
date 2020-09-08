package com.example.caixasdeseleo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    //CheckBox
    private CheckBox checkVerde, checkBranco, checkVermelho;
    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    //RadioGroup
    private RadioGroup opcaoSexo;

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

        //RadioButton
        sexoMasculino   = findViewById(R.id.radioButtonM);
        sexoFeminino    = findViewById(R.id.radioButtonF);
        //RadioGroup
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

    }
    public void radioButton() {
        //Ouvinte fica ouvindo por mudanças
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                if(checked == R.id.radioButtonM ) {
                    textoResultado.setText("Masculino");
                }
                else if (checked == R.id.radioButtonF) {
                    textoResultado.setText("Feminino");
                }
            }
        });
    }

    public void checkBox() {
        String texto = "";
        texto = "Nome: " + campoNome.getText().toString() + "\n";
        texto += "E-mail: " + campoEmail.getText().toString() + "\n";
        if(checkVerde.isChecked()) {
            //String corSelecionada = checkVerde.getText().toString();
            texto += "Verde selecionado - \n";
        }
        if(checkBranco.isChecked()) {
            texto += "Branco selecionado - \n";
        }
        if(checkVermelho.isChecked()) {
            texto += "Vermelho selecionado\n";
        }


         if(sexoMasculino.isChecked())  {
             texto += "Sexo: Masculino\n";
         } else if (sexoFeminino.isChecked()) {
             texto += "Sexo: Feminino\n";
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
        checkVermelho.setChecked(false);
        checkBranco.setChecked(false);
        checkVerde.setChecked(false);
        sexoFeminino.setChecked(false);
        sexoMasculino.setChecked(false);
    }
}