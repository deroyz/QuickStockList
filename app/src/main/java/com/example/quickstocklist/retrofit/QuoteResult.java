package com.example.quickstocklist.retrofit;

import com.example.quickstocklist.retrofit.QuoteResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuoteResult {

    @SerializedName("quoteResponse")
    @Expose
    private QuoteResponse quoteResponse;

    public QuoteResponse getQuoteResponse() {
        return quoteResponse;
    }

    public void setQuoteResponse(QuoteResponse quoteResponse) {
        this.quoteResponse = quoteResponse;
    }

}
