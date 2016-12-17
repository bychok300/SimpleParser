package com.anton.src.simpleparser_android;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

import android.webkit.WebView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static com.anton.src.simpleparser_android.R.id.editText;


/**
 * Created by rem0tec0de on 15.12.16.
 */

public class ParsedAndRendered extends Activity {
    /**
     * тут объявляем формат текст или хтмл,
     * кодировку и сам веб вью
     */
    final private String mimeType = "text/html";
    final private String encoding = "UTF-8";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parsedandrendered);

        //находим вебвью на активити
        webView = (WebView) findViewById(R.id.webView);
        //даем сылку на майтаск и запускаем ёё
        MyTask mt = new MyTask();
        mt.execute();

    }
    class MyTask extends AsyncTask<Void, Void, Void> {

        String html;//Тут храним html
        String url = getIntent().getExtras().getString("url");//тут принимаем наш урл введенный на мэйн активити
        @Override
        protected Void doInBackground(Void... params) {

            Document doc = null;//Здесь хранится будет разобранный html документ
            try {
                //Считываем url
                doc = Jsoup.connect("http://" + url).get();
            } catch (IOException e) {
                //Если не получилось считать
                e.printStackTrace();
            }

            //Если всё считалось, то вытаскиваем из считанного html документа всё
            if (doc!=null)
                html = doc.html();
            else
                html = "Шото пошло не так, я хз че там за хня. Мож с урлом что, а мож и с самим хтмл";

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            //тут в наше вебвью добавляем спаршеный текст и кодировку
            webView.loadDataWithBaseURL("", html, mimeType, encoding, "");
        }
    }
}