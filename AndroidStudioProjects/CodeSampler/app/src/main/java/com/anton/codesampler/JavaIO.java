package com.anton.codesampler;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.consoleio.ConsoleIO;
import com.anton.codesampler.directory.Directory;
import com.anton.codesampler.filecompression.FileCompression;
import com.anton.codesampler.fileserialization.FileSerialization;
import com.anton.codesampler.javaio.file.File;
import com.anton.codesampler.temproraryfiles.TemporaryFile;

/**
 * Created by rem0tec0de on 25.11.16.
 */

public class JavaIO extends ListActivity {
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
        final String[] File = new String[]{
                "File",
                "File Serialization",
                "File Compression",
                "Temporary File",
                "Directory",
                "Console IO"
                };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, File);
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
                Intent intent = new Intent(this, File.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, FileSerialization.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, FileCompression.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, TemporaryFile.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, Directory.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, ConsoleIO.class);
                startActivity(intent5);
                break;


        }
    }
}
