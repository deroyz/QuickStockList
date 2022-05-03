package com.example.quickstocklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 2;

    private RecyclerView mRecyclerView;
    private QuoteAdapter mQuoteAdapter;

    protected static final String BASE_URL =  "https://yfapi.net/v6/finance/quote?region=US&lang=en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        initRetrofit();

    }


    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_quotes);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        ArrayList<Quote> quotes = JsonUtils.extractQuotes();

        mQuoteAdapter = new QuoteAdapter(NUM_LIST_ITEMS, quotes);
        mRecyclerView.setAdapter(mQuoteAdapter);
    }

    private void initRetrofit() {
        retrofit2.Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();



    }




}