package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1,n2,resultado;

    EditText edt_n1 = (EditText) findViewById(R.id.edt_n1);
    EditText edt_n2 = (EditText) findViewById(R.id.edt_n2);

    Button btn_adisao = (Button) findViewById(R.id.btn_adisao);
    Button btn_subtracao = (Button) findViewById(R.id.btn_subtracao);
    Button btn_divisao = (Button) findViewById(R.id.btn_divisao);
    Button btn_multiplicacao = (Button) findViewById(R.id.btn_multiplicacao);

    TextView txt_exibir_resultado = (TextView) findViewById(R.id.txt_exibir_resultado);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void soma (View view){
            n1 = Double.parseDouble(edt_n1.getText().toString());
            n2 = Double.parseDouble(edt_n2.getText().toString());
            resultado = n1 + n2;

                txt_exibir_resultado.setText(String.valueOf(resultado));
        }

        public void subtrair (View view){
            n1 = Double.parseDouble(edt_n1.getText().toString());
            n2 = Double.parseDouble(edt_n2.getText().toString());
            resultado = n1 - n2;

                 txt_exibir_resultado.setText(String.valueOf(resultado));
    }

        public void dividir (View view){
            n1 = Double.parseDouble(edt_n1.getText().toString());
            n2 = Double.parseDouble(edt_n2.getText().toString());
            resultado = n1 / n2;

                txt_exibir_resultado.setText(String.valueOf(resultado));
    }
        public void multiplicar (View view){
            n1 = Double.parseDouble(edt_n1.getText().toString());
            n2 = Double.parseDouble(edt_n2.getText().toString());
            resultado = n1 * n2;

                txt_exibir_resultado.setText(String.valueOf(resultado));
    }

}
