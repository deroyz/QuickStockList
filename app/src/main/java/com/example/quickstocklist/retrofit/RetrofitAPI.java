package com.example.quickstocklist.retrofit;


import com.example.quickstocklist.retrofit.RetrofitDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface RetrofitAPI {

    // static String BASE_URL_YAHOO_FINANCE = "https://yfapi.net/v6/finance/quote";

    @GET("quote?region=US&lang=en&symbols=?api_key={api_key}")
    Call<RetrofitDataModel> getJson(@Header("api_key")String api_key);


}