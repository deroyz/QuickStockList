package com.example.quickstocklist;

//  object contains on information related to a single stock
public class Quote {

    //  Name of the stock
    private String mDisplayName;

    //  Ask price of the stock
    private double mAskPrice;

    public Quote(String displayName, double askPrice) {
        mDisplayName = displayName;
        mAskPrice = askPrice;
    }

    //  Returns the name of the stock
    public String getDisplayName() {
        return mDisplayName;
    }

    // Returns the ask price of the stock
    public double getAskPrice(){
        return mAskPrice;
    }

}
