package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //EditText
    private TextInputEditText edtPrecoAlcool, edtPrecoGasonlina;
    //TextView
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPrecoAlcool      = findViewById(R.id.edtPrecoAlcool);
        edtPrecoGasonlina   = findViewById(R.id.edtPrecoGasolina);
        txtResultado        = findViewById(R.id.txtResultado);
    }

    public void calcularPreco(View view) {
        //Recuperar valores digitados
        String precoAlcool = edtPrecoAlcool.getText().toString();
        String precoGasonlina = edtPrecoGasonlina.getText().toString();

        //Validar campos digitador
       Boolean camposValidados = validarCampos(precoAlcool, precoGasonlina);
       if(camposValidados) {
           //Convertendo String para números
           Double valorAlcool = Double.parseDouble(precoAlcool);
           Double valorGasolina = Double.parseDouble(precoGasonlina);

           /* Fazer cálculo de menor preço
           Se (valorAlcool / valorGasolina) >= 0.7 melhor utilizar gasonlina
           senão é melhor utilizar álcool
           * */
           Double resultado = valorAlcool / valorGasolina;

           if(resultado >= 0.7){
               txtResultado.setText("Melhor utilizar  Gasolina");
           } else {
               txtResultado.setText("Melhor utilizar Álcool");
           }
       } else {
           txtResultado.setText("Preencha os preços primeiro!");
        }
    }

    public Boolean validarCampos(String pAlcool, String pGasolina) {
        Boolean camposValidados = true;
        if(pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGasolina == null || pGasolina.equals("") ) {
            camposValidados = false;
        }

        return camposValidados;
    }
}