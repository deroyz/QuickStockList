package com.example.quickstocklist;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {

    @GET("quotes")
    Call<List<Quote>> getQuotes();

}