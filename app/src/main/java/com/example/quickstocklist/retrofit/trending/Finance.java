package com.example.quickstocklist.retrofit.trending;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Finance {

    @SerializedName("result")
    @Expose
    private List <FinanceResult> financeResult = null;

    @SerializedName("error")
    @Expose
    private Object error;

    public List<FinanceResult> getFinanceResult() {
        return financeResult;
    }

    public void setFinanceResults(List<FinanceResult> financeResults) {
        this.financeResult = financeResult;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
