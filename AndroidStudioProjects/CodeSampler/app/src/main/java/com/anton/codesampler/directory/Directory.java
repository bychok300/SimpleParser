package com.anton.codesampler.directory;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.directory.CheckIfDirectoryIsEmpty;
import com.anton.codesampler.directory.CopyDirectory;
import com.anton.codesampler.directory.CreateDirectory;
import com.anton.codesampler.directory.DeleteDirectory;
import com.anton.codesampler.directory.GetTheCurrentWorkingDirectory;
import com.anton.codesampler.directory.TraverseDirectoryStructure;

/**
 * Created by rem0tec0de on 27.11.16.
 */
public class Directory extends ListActivity {
    /***
     * создаем список
     * <p>
     * с начала создаем адаптер
     */
    private ArrayAdapter<String> mAdapter;

    //тут у нас стандартный вызов
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //тут мы создаем элементы списка
        final String[] Directory = new String[]{
                "Create directory" ,
                "Delete directory",
                "Copy directory",
                "Traverse /List a directory structure",
                "Check if directory is empty",
                "Get the current working directory"
        };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Directory);
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
                Intent intent = new Intent(this, CreateDirectory.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, DeleteDirectory.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, CopyDirectory.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, TraverseDirectoryStructure.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, CheckIfDirectoryIsEmpty.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, GetTheCurrentWorkingDirectory.class);
                startActivity(intent5);
                break;

        }
    }
}