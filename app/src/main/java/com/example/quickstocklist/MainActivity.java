package com.example.quickstocklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.quickstocklist.retrofit.RetrofitAPI;
import com.example.quickstocklist.retrofit.RetrofitDataModel;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = JsonUtils.class.getSimpleName();

    private static final int NUM_LIST_ITEMS = 2;

    private RecyclerView mRecyclerView;
    private QuoteAdapter mQuoteAdapter;
    private TextView mRetrofitTest;

    protected static final String BASE_URL = "https://yfapi.net/v6/finance/";
    protected static final String API_KEY = "yRbeIOfz5Q1cEvR1H4rBf1QnKmbWuDga2eFBPv3b";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRetrofitTest = (TextView) findViewById(R.id.tv_retrofit_test);

        initRecyclerView();
        initNetwork();

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

    private void initNetwork() {

        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        OkHttpClient client = httpClient.build();


        //Retrofit Builder
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();


         //Instance for interface
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);

        //Instance for call / getting Data with API + Data model defined
        Call<RetrofitDataModel> call = retrofitAPI.getJson(API_KEY);


        call.enqueue(new Callback<RetrofitDataModel>() {
            @Override
            public void onResponse(Call<RetrofitDataModel> call, Response<RetrofitDataModel> response) {

                //Checking for the response (200 is successful)
                if(response.code() != 200){
                    return;
                }


                //Get the data into textView
                String json = "";

                Log.e(LOG_TAG, "DisplayName: " + response.body().getDisplayName()
                        + "\n" + "Ask" + response.body().getAsk()
                        + "\n" + "Symbol" + response.body().getSymbol());

                json = "displayName= " + response.body().getDisplayName() + "\n"
                        + "ask" + response.body().getAsk() + "\n"
                        + "symbol" + response.body().getSymbol() + "\n";

                mRetrofitTest.setText(json);

            }

            @Override
            public void onFailure(Call<RetrofitDataModel> call, Throwable t) {
                Log.e(LOG_TAG, "Network Failed");
            }
        });

    }


}