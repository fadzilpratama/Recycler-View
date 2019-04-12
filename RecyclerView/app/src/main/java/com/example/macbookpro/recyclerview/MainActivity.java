package com.example.macbookpro.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private WordListAdapter wordListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> stringList = new ArrayList<>();
        stringList.add("PEMROGRAMAN");
        stringList.add("PEMROGRAMAN A");
        stringList.add("PEMROGRAMAN B");
        stringList.add("PEMROGRAMAN C");
        stringList.add("PEMROGRAMAN D");
        recyclerview = findViewById(R.id.recyclerview);
        wordListAdapter = new WordListAdapter(this, stringList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(false);
        recyclerview. setAdapter (wordListAdapter);
        recyclerview. setLayoutManager (layoutManager);
    }
}
