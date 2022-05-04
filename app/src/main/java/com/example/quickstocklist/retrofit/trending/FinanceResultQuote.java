package com.example.quickstocklist.retrofit.trending;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FinanceResultQuote {

    @SerializedName("symbol")
    @Expose
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
