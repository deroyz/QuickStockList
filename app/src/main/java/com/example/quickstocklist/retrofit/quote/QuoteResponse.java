package com.example.quickstocklist.retrofit.quote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuoteResponse {

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("result")
    @Expose
    private List<QuoteResponseResult> quoteResponseResult = null;

    public List<QuoteResponseResult> getResult() {
        return quoteResponseResult;
    }

    public void setResult(List<QuoteResponseResult> quoteResponseResult) {
        this.quoteResponseResult = quoteResponseResult;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}