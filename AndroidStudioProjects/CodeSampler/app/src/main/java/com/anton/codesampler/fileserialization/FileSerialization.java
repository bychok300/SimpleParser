package com.anton.codesampler.fileserialization;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.fileserialization.ReadObjFromFile;
import com.anton.codesampler.fileserialization.WriteAnObjToFile;

/**
 * Created by rem0tec0de on 27.11.16.
 */
public class FileSerialization extends ListActivity{
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //тут мы создаем элементы списка
        final String[] fileSer = new String[]{
                "Write an Object to file",
                "Read an Object from file"};
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, fileSer);
        //говорим нашему списку Работай!
        setListAdapter(mAdapter);
    }

    /***
     * тут мы делаем обработчик которой при клике на элемент списка кидает нас на новое активити
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //работаем по позиции, при 0-вой позиции переходим в JavaIO etc
        switch (position) {
            case 0:
                Intent intent = new Intent(this, WriteAnObjToFile.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this,ReadObjFromFile.class);
                startActivity(intent1);
                break;


        }
    }
}
