package com.example.ff.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));
        words.add(new Word("", ""));


        ArrayAdapter<Word> listiems = new ArrayAdapter<Word>(this, R.layout.support_simple_spinner_dropdown_item, words);
        ListView listV=(ListView)findViewById(R.id.list);

        listV.setAdapter(listiems);

    }
}
