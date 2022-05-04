package com.example.quickstocklist.retrofit.trending;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("finance")
    @Expose
    private Finance finance;

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance boxOfficeResult) {
        this.finance = finance;
    }

}