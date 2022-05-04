package com.example.quickstocklist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.quickstocklist.retrofit.trending.FinanceResult;
import com.example.quickstocklist.retrofit.trending.FinanceResultQuote;
import com.example.quickstocklist.retrofit.RetrofitClient;
import com.example.quickstocklist.retrofit.RetrofitInterface;
import com.example.quickstocklist.retrofit.trending.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = JsonUtils.class.getSimpleName();

    private static final int NUM_LIST_ITEMS = 1;

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

        mRetrofitInterface.getFinance("US").enqueue(new Callback<Result>() {

            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {

                Result result = response.body();

                List<FinanceResult> financeResult = result.getFinance().getFinanceResult();

                String printMessage = "";

                for (int i = 0; i < financeResult.get(0).getFinanceResultQuote().size(); i++) {

                   String symbol = financeResult.get(0).getFinanceResultQuote().get(i).getSymbol();

                    printMessage += symbol + " ";

                    Log.e(LOG_TAG, "DisplayName: " + printMessage);

                }
                mRetrofitTest.setText(printMessage);

            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {

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