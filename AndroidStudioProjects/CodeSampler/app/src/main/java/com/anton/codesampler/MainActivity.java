package com.anton.codesampler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***
     * тут мы вызываем навое окошко при клике на кнопку
     */
    public void Java(View view) {
        //делаем экземпляр класса интент с (текущей страницой, классом обработчиком перехода)
        Intent intent = new Intent(MainActivity.this, JavaCore.class);
        // стартуем нашу новую активити
        startActivity(intent);


    }

}