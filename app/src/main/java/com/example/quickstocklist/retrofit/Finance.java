package com.example.quickstocklist.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Finance {

    @SerializedName("result")
    @Expose
    private List<FinanceResult> result = null;
    @SerializedName("error")
    @Expose
    private Object error;

    public List<FinanceResult> getResult() {
        return result;
    }

    public void setResult(List<FinanceResult> result) {
        this.result = result;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
