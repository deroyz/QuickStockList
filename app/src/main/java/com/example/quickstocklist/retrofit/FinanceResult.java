package com.example.quickstocklist.retrofit;

import com.example.quickstocklist.Quote;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FinanceResult {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("quotes")
    @Expose
    private List<Quote> quotes = null;
    @SerializedName("jobTimestamp")
    @Expose
    private Long jobTimestamp;
    @SerializedName("startInterval")
    @Expose
    private Long startInterval;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Long getJobTimestamp() {
        return jobTimestamp;
    }

    public void setJobTimestamp(Long jobTimestamp) {
        this.jobTimestamp = jobTimestamp;
    }

    public Long getStartInterval() {
        return startInterval;
    }

    public void setStartInterval(Long startInterval) {
        this.startInterval = startInterval;
    }
}
