package com.anton.codesampler.filecompression;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.filecompression.CompressFileInGZIPFormat;
import com.anton.codesampler.filecompression.CompressFilesInZIPFormat;
import com.anton.codesampler.filecompression.CompressSerializedObjectIntoFile;
import com.anton.codesampler.filecompression.DecompressFileFromGZIPFile;
import com.anton.codesampler.filecompression.DecompressFilesFromZIPFile;
import com.anton.codesampler.filecompression.DecompressSerializedObjectFromGzipFile;

/**
 * Created by rem0tec0de on 27.11.16.
 */
public class FileCompression extends ListActivity {
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
        final String[] FileCompress = new String[]{
                    "Compress files in ZIP format",
                    "Decompress files from a ZIP file",
                    "Compress a file in GZIP format",
                    "Decompress file from GZIP file",
                    "Compress serialized object into file",
                    "Decompress serialized object from a Gzip file"
        };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, FileCompress);
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
                Intent intent = new Intent(this, CompressFilesInZIPFormat.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, DecompressFilesFromZIPFile.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, CompressFileInGZIPFormat.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, DecompressFileFromGZIPFile.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, CompressSerializedObjectIntoFile.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, DecompressSerializedObjectFromGzipFile.class);
                startActivity(intent5);
                break;
        }
    }
}
