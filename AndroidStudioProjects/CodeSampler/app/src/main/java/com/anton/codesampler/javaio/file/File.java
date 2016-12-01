package com.anton.codesampler.javaio.file;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.javaio.file.AppendContentToFile;
import com.anton.codesampler.javaio.file.AssignFileContentIntoVariable;
import com.anton.codesampler.javaio.file.ChangeTheFileLastModifiedDate;
import com.anton.codesampler.javaio.file.CheckIfFileExists;
import com.anton.codesampler.javaio.file.CheckIfFileIsHidden;
import com.anton.codesampler.javaio.file.ConstructFilePath;
import com.anton.codesampler.javaio.file.ConvertArrayOfBytesIntoFile;
import com.anton.codesampler.javaio.file.ConvertFileIntoAnArrayOfBytes;
import com.anton.codesampler.javaio.file.ConvertFileToHex;
import com.anton.codesampler.javaio.file.ConvertInputStreamToString;
import com.anton.codesampler.javaio.file.ConvertStringToInputStream;
import com.anton.codesampler.javaio.file.CopyFile;
import com.anton.codesampler.javaio.file.CreateFile;
import com.anton.codesampler.javaio.file.DeleteFile;
import com.anton.codesampler.javaio.file.DeleteFilesWithCertainExtensionOnly;
import com.anton.codesampler.javaio.file.FindFilesWithCertainExtensionOnly;
import com.anton.codesampler.javaio.file.GenerateFileChecksumValue;
import com.anton.codesampler.javaio.file.GetFileSize;
import com.anton.codesampler.javaio.file.GetFilepathOfFile;
import com.anton.codesampler.javaio.file.GetTheFileCreationDate;
import com.anton.codesampler.javaio.file.GetTheFileLastModifiedDate;
import com.anton.codesampler.javaio.file.GetTheTotalNumberOfLinesOfFile;
import com.anton.codesampler.javaio.file.GetTotalOfFreeDiskSpace;
import com.anton.codesampler.javaio.file.MakeFileReadOnly;
import com.anton.codesampler.javaio.file.MoveFileToAnotherDirectory;
import com.anton.codesampler.javaio.file.ReadFileEithBIS;
import com.anton.codesampler.javaio.file.ReadFileWithBufferedReader;
import com.anton.codesampler.javaio.file.ReadUTF8EncodedDataFromFile;
import com.anton.codesampler.javaio.file.RenameFile;
import com.anton.codesampler.javaio.file.SetTheFilePermission;
import com.anton.codesampler.javaio.file.WriteFileEithBW;
import com.anton.codesampler.javaio.file.WriteUTF8EncodedDataIntoFile;

/**
 * Created by rem0tec0de on 26.11.16.
 */

public class File extends ListActivity {
    /***
     * создаем список
     * <p>
     * с начала создаем адаптер
     */
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //тут мы создаем элементы списка
        final String[] file = new String[]{
                "Create a file",
                "Construct file path",
                "Set the file permission",
                "Read file with BufferedInputStream",
                "Read file with BufferedReader",
                "Write file with FileOutputStream",
                "Write file with BufferedWriter",
                "Append content to file",
                "Delete a file",
                "Delete files with certain extension only",
                "Find files with certain extension only",
                "Rename a file",
                "Copy a file",
                "Move a file to another directory",
                "Get the file creation date",
                "Get the file last modified date",
                "Change the file last modified date",
                "Make a file read only",
                "Get file size",
                "Get the filepath of a file",
                "Get the total number of lines of a file",
                "Check if a file exists",
                "Check if a file is hidden",
                "Read UTF-8 encoded data from a file",
                "Write UTF-8 encoded data into a file",
                "Assign file content into a variable",
                "Generate a file checksum value",
                "Convert File into an array of bytes",
                "Convert array of bytes into File",
                "Convert String to InputStream",
                "Convert InputStream to String",
                "Convert File to Hex",
                "Get total of free disk space in your partition or volume"};
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, file);
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
                Intent intent = new Intent(this, CreateFile.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, ConstructFilePath.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, SetTheFilePermission.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, ReadFileEithBIS.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, ReadFileWithBufferedReader.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, WriteFileWithFOS.class);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(this, WriteFileEithBW.class);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(this, AppendContentToFile.class);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(this, DeleteFile.class);
                startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(this, DeleteFilesWithCertainExtensionOnly.class);
                startActivity(intent9);
                break;
            case 10:
                Intent intent10 = new Intent(this, FindFilesWithCertainExtensionOnly.class);
                startActivity(intent10);
                break;
            case 11:
                Intent intent11 = new Intent(this, RenameFile.class);
                startActivity(intent11);
                break;
            case 12:
                Intent intent12 = new Intent(this, CopyFile.class);
                startActivity(intent12);
                break;
            case 13:
                Intent intent13 = new Intent(this, MoveFileToAnotherDirectory.class);
                startActivity(intent13);
                break;
            case 14:
                Intent intent14 = new Intent(this, GetTheFileCreationDate.class);
                startActivity(intent14);
                break;
            case 15:
                Intent intent15 = new Intent(this, GetTheFileLastModifiedDate.class);
                startActivity(intent15);
                break;
            case 16:
                Intent intent16 = new Intent(this, ChangeTheFileLastModifiedDate.class);
                startActivity(intent16);
                break;
            case 17:
                Intent intent17 = new Intent(this, MakeFileReadOnly.class);
                startActivity(intent17);
                break;
            case 18:
                Intent intent18 = new Intent(this, GetFileSize.class);
                startActivity(intent18);
                break;
            case 19:
                Intent intent19 = new Intent(this, GetFilepathOfFile.class);
                startActivity(intent19);
                break;
            case 20:
                Intent intent20 = new Intent(this, GetTheTotalNumberOfLinesOfFile.class);
                startActivity(intent20);
                break;
            case 21:
                Intent intent21 = new Intent(this, CheckIfFileExists.class);
                startActivity(intent21);
                break;
            case 22:
                Intent intent22 = new Intent(this, CheckIfFileIsHidden.class);
                startActivity(intent22);
                break;
            case 23:
                Intent intent23 = new Intent(this, ReadUTF8EncodedDataFromFile.class);
                startActivity(intent23);
                break;
            case 24:
                Intent intent24 = new Intent(this, WriteUTF8EncodedDataIntoFile.class);
                startActivity(intent24);
                break;
            case 25:
                Intent intent25 = new Intent(this, AssignFileContentIntoVariable.class);
                startActivity(intent25);
                break;
            case 26:
                Intent intent26 = new Intent(this, GenerateFileChecksumValue.class);
                startActivity(intent26);
                break;
            case 27:
                Intent intent27 = new Intent(this, ConvertFileIntoAnArrayOfBytes.class);
                startActivity(intent27);
                break;
            case 28:
                Intent intent28 = new Intent(this, ConvertArrayOfBytesIntoFile.class);
                startActivity(intent28);
                break;
            case 29:
                Intent intent29 = new Intent(this, ConvertStringToInputStream.class);
                startActivity(intent29);
                break;
            case 30:
                Intent intent30 = new Intent(this, ConvertInputStreamToString.class);
                startActivity(intent30);
                break;
            case 31:
                Intent intent31 = new Intent(this, ConvertFileToHex.class);
                startActivity(intent31);
                break;
            case 32:
                Intent intent32 = new Intent(this, GetTotalOfFreeDiskSpace.class);
                startActivity(intent32);
                break;


        }
    }
}
