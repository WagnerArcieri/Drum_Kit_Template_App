package br.com.wagnerarcieri.drumkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {


    int delayTime = 1000 * 5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        changeActivity();
    }

    private void changeActivity() {
        Log.d(AppUtils.TAG, "trocarTela: Esperando um Tempo....");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(AppUtils.TAG, "trocarTela: Trocando de tela....");

                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(trocarDeTela);
                finish();
            }
        },delayTime);


    }


}