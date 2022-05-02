package com.example.quickstocklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 2;

    private RecyclerView mRecyclerView;
    private QuoteAdapter mQuoteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_quotes);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

       ArrayList<Quote> quotes = JsonUtils.extractQuotes();

        mQuoteAdapter = new QuoteAdapter(NUM_LIST_ITEMS, quotes);
        mRecyclerView.setAdapter(mQuoteAdapter);

    }

}