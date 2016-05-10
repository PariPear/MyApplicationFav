package com.example.pare.myapplication;

import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.io.File;

/**
 * Created by User on 9/5/2559.
 */
public class OneFragment extends Fragment {
    private String[] FilePathStrings;
    private String[] FileNameStrings;
    private File[] listFile;
    GridView grid;
    GridViewAdapter adapter;
    File file;

    public OneFragment() {


        // Locate the image folder in your SD Card
        file = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Collections");
        // Create a new folder if no folder named SDImageTutorial exist

        if (file.isDirectory()) {
            listFile = file.listFiles();
            // Create a String array for FilePathStrings
            FilePathStrings = new String[listFile.length];
            // Create a String array for FileNameStrings
            FileNameStrings = new String[listFile.length];

            for (int i = 0; i < listFile.length; i++) {
                // Get the path of the image file
                FilePathStrings[i] = listFile[i].getAbsolutePath();
                // Get the name image file
                FileNameStrings[i] = listFile[i].getName();
            }
        }


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}
