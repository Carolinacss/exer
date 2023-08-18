package com.example.appexercicios;
//Declaração do pacote da classe MainActivity//

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/*Cada elemento é importado para a interface do usuário*/
public class MainActivity extends AppCompatActivity {
    /* A classe MainActivity existe, e possui a declaração de variáveis */
    public float ca, re, so,result;
     //Declarando as váriaveis que serão manipuladas//
    EditText qc;
    EditText qr;
    EditText qs;
    TextView resultado;

    @Override
    /*O método onCreate é responsável pela criação da atividade(activity), possui támbem o método setContentView usado para definir o layout xml.*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /*Declarando os valores das variaveis*/
        qc = findViewById(R.id.txtc);
        qr = findViewById(R.id.txtr);
        qs = findViewById(R.id.txts);
        resultado = findViewById(R.id.txtresult);

        ca = 2F;
        re = 2.5F;
        so = 1.5F;
    }
    /*Nesta função é utilizado o private float, sendo responsável por calcular o resultado com bases nos valores*/
        private float txtresult(){
            float c = Integer.parseInt(qc.getText().toString());
            float r = Integer.parseInt(qr.getText().toString());
            float s = Integer.parseInt(qs.getText().toString());

            result = (c * ca) + (r * re) + (s * so);

            return result;
        }

    //Esse método abaixo retorna os valores calculados na função construida//
        public void btncalcular(View c){
        resultado.setText(String.valueOf(txtresult()));
    }
    //Esse método inicia uma intenção de iniciar uma nova atividade chamada MainActivity2//
        public void btnproximo(View p) {
         Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
    }
}
