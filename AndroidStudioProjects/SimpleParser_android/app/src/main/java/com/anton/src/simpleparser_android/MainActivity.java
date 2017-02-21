package com.anton.src.simpleparser_android;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.Switch;



public class MainActivity extends AppCompatActivity {

    //объявляем свитч
    Switch swi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init switch
        swi = (Switch) findViewById(R.id.switch1);

    }

    /**
     *
     * метод обработчик нажатия кнопки
     */
    protected void ClickMe(View v){
        /**
         * если наш свитч включен то рендерим, если нет то выводим в тексте
         */
        if (swi.isChecked()){ //init editText
          EditText userEditText = (EditText) findViewById(R.id.editText);

          //new activity
          Intent intent = new Intent(MainActivity.this, ParsedAndRendered.class);

          // в ключ url пихаем текст из первого текстового поля
          intent.putExtra("url", userEditText.getText().toString());

          //start new activity
          startActivity(intent);
        }

      else {
          //init editText
          EditText userEditText = (EditText) findViewById(R.id.editText);

          //new activity
          Intent intent = new Intent(MainActivity.this, Parsed.class);

          // в ключ url пихаем текст из первого текстового поля
          intent.putExtra("url", userEditText.getText().toString());

          //start new activity
          startActivity(intent);
        }

    }
}


