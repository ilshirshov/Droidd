package com.example.droidd;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.*;
import java.util.ArrayList;

public class BallsListActivity extends AppCompatActivity {

    private RecyclerView ballsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.balls_list);
        initRecyclerView();
    };

    private void initRecyclerView() {
        ballsRecyclerView = findViewById(R.id.recycler_view);
        ballsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> base = getIntent().getExtras().getStringArrayList("base");
        //base.add("первая строка");
        //base.add("вторая строка");
        BallsAdapter ballsAdapter = new BallsAdapter(base);

        ballsRecyclerView.setAdapter(ballsAdapter );

    }



}


