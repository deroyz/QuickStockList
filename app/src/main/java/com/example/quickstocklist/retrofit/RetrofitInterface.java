package com.example.quickstocklist.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitInterface {

    // static String BASE_URL_YAHOO_FINANCE = "https://yfapi.net/v6/finance/quote";

    @GET("https://yfapi.net/v6/finance/quote")
    Call<QuoteResult> getQuoteResult(@Query("region") String region,
                                       @Query("lang") String lang,
                                       @Query("symbols") String symbols);


    @GET("https://yfapi.net/v1/finance/trending/{region}")
    Call<FinanceResult> getTrendingResult (@Path("region") String region);
}


