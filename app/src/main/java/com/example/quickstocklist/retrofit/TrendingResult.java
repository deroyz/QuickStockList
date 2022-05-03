package com.example.quickstocklist.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrendingResult {

    @SerializedName("finance")
    @Expose
    private Finance finance;

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }
}
