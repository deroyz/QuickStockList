package com.example.quickstocklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.quickstocklist.retrofit.FinanceResult;
import com.example.quickstocklist.retrofit.RetrofitClient;
import com.example.quickstocklist.retrofit.RetrofitInterface;
import com.example.quickstocklist.retrofit.QuoteResponse;

import java.util.ArrayList;
import java.util.List;

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

    private RetrofitClient mRetrofitClient;
    private RetrofitInterface mRetrofitInterface;


    protected static final String BASE_URL = "https://yfapi.net/";
    protected static final String API_KEY = "yRbeIOfz5Q1cEvR1H4rBf1QnKmbWuDga2eFBPv3b";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRetrofitTest = (TextView) findViewById(R.id.tv_retrofit_test);

        initRecyclerView();

        mRetrofitClient = RetrofitClient.getRetrofitClient();
        mRetrofitInterface = RetrofitClient.getRetrofitInterface();

        mRetrofitInterface.getTrendingResult("en").enqueue(new Callback<FinanceResult>() {
            @Override
            public void onResponse(Call<FinanceResult> call, Response<FinanceResult> response) {
                FinanceResult financeResult = response.body();

                List<Quote> quotes = financeResult.getQuotes();

                String printMessage = "";

                for(int i = 0; i < quotes.size(); i++){
                    printMessage += quotes.get(i).toString() + "";
                }
                mRetrofitTest.setText(printMessage);

            }

            @Override
            public void onFailure(Call<FinanceResult> call, Throwable t) {
                return;
            }
        });

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


}