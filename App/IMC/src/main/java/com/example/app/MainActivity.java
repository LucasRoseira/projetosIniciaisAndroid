package com.example.app;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    EditText edtPeso, edtAltura;
    Button btnCalcular;
    TextView txtIMC;
    RadioButton RbFeminino;
    //ImageView ImageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set our view from the "main" layout resource
        setContentView(R.layout.activity_main);


        edtPeso = (EditText) findViewById(R.id.EdtPeso);
        edtAltura = (EditText) findViewById(R.id.EdtAltura);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtIMC = (TextView) findViewById(R.id.txtIMC);
        RbFeminino = (RadioButton) findViewById(R.id.rbFeminimo);
        // ImageView1 = (ImageView)FindViewById(Resource.Id.ImageView1);

        // ImageView1.SetImageResource(Resource.Drawable.imc);
        //btnCalcular += btnCalcular;

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float IMC;
                IMC = Float.parseFloat(edtPeso.getText().toString()) / (Float.parseFloat(edtAltura.getText().toString()) * Float.parseFloat(edtAltura.getText().toString()));

                DecimalFormat formato = new DecimalFormat("#.00");
                String sIMC = formato.format(IMC);
                if (RbFeminino.isSelected()) {
                    if (IMC > 39)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Mórbida");
                    else if (IMC >= 29 && IMC < 39)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Moderada");
                    else if (IMC >= 24 && IMC < 29)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Leve");
                    else if (IMC >= 19 && IMC < 24)
                        txtIMC.setText("IMC: " + sIMC + "  Normal");
                    else if (IMC < 19)
                        txtIMC.setText("IMC: " + sIMC + "  Abaixo do Normal");
                } else {
                    if (IMC > 40)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Mórbida");
                    else if (IMC >= 30 && IMC < 40)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Moderada");
                    else if (IMC >= 25 && IMC < 30)
                        txtIMC.setText("IMC: " + sIMC + "  Obesidade Leve");
                    else if (IMC >= 20 && IMC < 25)
                        txtIMC.setText("IMC: " + sIMC + "  Normal");
                    else if (IMC < 20)
                        txtIMC.setText("IMC: " + sIMC + "  Abaixo do Normal");
                }
            }
        });
    }
}
