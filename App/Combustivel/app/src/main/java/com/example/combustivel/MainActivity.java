package com.example.combustivel;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class Mask {

    //Código utilizado para inserir uma mascara nos EDTs
    public static String unmask(String s) {
        return s.replaceAll("[.]", "").replaceAll("[-]", "")
                .replaceAll("[/]", "").replaceAll("[(]", "")
                .replaceAll("[)]", "");
    }

    public static TextWatcher insert(final String mask, final EditText ediTxt) {
        return new TextWatcher() {
            boolean isUpdating;
            String old = "";
            public void onTextChanged(CharSequence s, int start, int before,int count) {
                String str = Mask.unmask(s.toString());
                String mascara = "";
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if (m != '#' && str.length() > old.length()) {
                        mascara += m;
                        continue;
                    }
                    try {
                        mascara += str.charAt(i);
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                ediTxt.setText(mascara);
                ediTxt.setSelection(mascara.length());
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void afterTextChanged(Editable s) {}
        };
    }
}
public class MainActivity extends AppCompatActivity {
    EditText edtGasolina, edtEtanol;
    Button btnCalcular;
    TextView txtResultado;
    Image imgNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGasolina = findViewById(R.id.EdtGasonlina);
        edtEtanol = findViewById(R.id.EdtEtanol);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (edtEtanol.getText().toString().trim().equals("") || edtGasolina.getText().toString().trim().equals("")) {
                    Context contexto = getApplicationContext();
                    String texto = "Algum campo esta vazio!!!";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                } else {

                    double combustivelMaisRentavel;
                    double porcentagem = 0.7;

                    combustivelMaisRentavel = Double.parseDouble(edtEtanol.getText().toString())
                            / Double.parseDouble(edtGasolina.getText().toString());

                    if (combustivelMaisRentavel < porcentagem) {
                        txtResultado.setText("O combustível mais rentável é o etanol");
                    } else {
                        txtResultado.setText("O combustível mais rentável é a gasolina");
                    }
                }
            }
        });
    }
}
