//Declaração do pacote da classe MainActivity2//
package com.example.appexercicios;

//Aqui cada elemento é importado para a interface do usuário//
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

//Esse import serve para importa as classes//
import androidx.appcompat.app.AppCompatActivity;

/* A classe MainActivity2 é a parte principal do aplicativo, dentro dela existe a declaração de variáveis*/
public class MainActivity2 extends AppCompatActivity {
    private EditText valora;
    private EditText valorb;
    private TextView result;

    /*O método onCreate é responsável pela criação da atividade(activity).Possui támbem o método setContentView usado para definir o layout xml.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        valora = findViewById(R.id.txtvalor1);
        valorb = findViewById(R.id.txtvalor2);
        result = findViewById(R.id.txtresultado2);

        // pegando o video view
        VideoView video = findViewById(R.id.vv);

        //adicionei uma videoView mostrando as imagens do cardapio em forma de video
        Uri src = Uri.parse("android.resource://com.example.appexercicios/raw/math");
        video.setVideoURI(src);

        video.setMediaController(new MediaController(this));
    }

    //Esse método abaixo retorna os valores calculados na função construida//
    public void btncalcular2(View m) {

        double a = Double.parseDouble(valora.getText().toString());
        double b = Double.parseDouble(valorb.getText().toString());

        //Nesta função é utilizado o módulo que serve como divisor entre valores//
        if (a % b == 0 || b % a == 0) {
            result.setText("São múltiplos");
        } else {
            result.setText("Não são múltiplos");
        }
    }
}