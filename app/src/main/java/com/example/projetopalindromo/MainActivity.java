package com.example.projetopalindromo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projetopalindromo.domain.Palindromo;
import com.example.projetopalindromo.domain.PalindromoKotlin;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btVerificar = (Button) findViewById(R.id.bt_verificar);
        btVerificar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        EditText etPalindromo = (EditText) findViewById(R.id.et_palindromo);
        TextView tvResposta = (TextView) findViewById(R.id.tv_resposta);
//        Palindromo palindromo = new Palindromo(etPalindromo.getText().toString());
        PalindromoKotlin palindromo = new PalindromoKotlin(etPalindromo.getText().toString());
        String resposta;
        if (palindromo.isPalindromo()) {
            resposta = "\n\nÉ um palindromo.";
        } else {
            resposta = "\n\nNão é um palindromo.";
        }
        resposta = palindromo.getConteudo() + " " + resposta;
        tvResposta.setText(resposta);
    }
}