package com.example.quickstocklist;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public final class JsonUtils {

    private static final String LOG_TAG = JsonUtils.class.getSimpleName();

    private static final String SAMPLE_JSON_STRING = "{\n" +
            "  \"quoteResponse\": {\n" +
            "    \"error\": null,\n" +
            "    \"result\": [\n" +
            "      {\n" +
            "        \"ask\": 117.27,\n" +
            "        \"askSize\": 8,\n" +
            "        \"averageDailyVolume10Day\": 233119800,\n" +
            "        \"averageDailyVolume3Month\": 170533131,\n" +
            "        \"bid\": 117.25,\n" +
            "        \"bidSize\": 22,\n" +
            "        \"bookValue\": 4.218,\n" +
            "        \"currency\": \"USD\",\n" +
            "        \"displayName\": \"Apple\",\n" +
            "        \"dividendDate\": 1597276800,\n" +
            "        \"earningsTimestamp\": 1596126600,\n" +
            "        \"earningsTimestampEnd\": 1604318400,\n" +
            "        \"earningsTimestampStart\": 1603882740,\n" +
            "        \"epsCurrentYear\": 3.23,\n" +
            "        \"epsForward\": 3.86,\n" +
            "        \"epsTrailingTwelveMonths\": 3.296,\n" +
            "        \"esgPopulated\": false,\n" +
            "        \"exchange\": \"NMS\",\n" +
            "        \"exchangeDataDelayedBy\": 0,\n" +
            "        \"exchangeTimezoneName\": \"America/New_York\",\n" +
            "        \"exchangeTimezoneShortName\": \"EDT\",\n" +
            "        \"fiftyDayAverage\": 112.823425,\n" +
            "        \"fiftyDayAverageChange\": 4.4965744,\n" +
            "        \"fiftyDayAverageChangePercent\": 0.03985497,\n" +
            "        \"fiftyTwoWeekHigh\": 137.98,\n" +
            "        \"fiftyTwoWeekHighChange\": -20.659996,\n" +
            "        \"fiftyTwoWeekHighChangePercent\": -0.14973181,\n" +
            "        \"fiftyTwoWeekLow\": 53.1525,\n" +
            "        \"fiftyTwoWeekLowChange\": 64.167496,\n" +
            "        \"fiftyTwoWeekLowChangePercent\": 1.2072338,\n" +
            "        \"fiftyTwoWeekRange\": \"53.1525 - 137.98\",\n" +
            "        \"financialCurrency\": \"USD\",\n" +
            "        \"firstTradeDateMilliseconds\": 345479400000,\n" +
            "        \"forwardPE\": 30.393784,\n" +
            "        \"fullExchangeName\": \"NasdaqGS\",\n" +
            "        \"gmtOffSetMilliseconds\": -14400000,\n" +
            "        \"language\": \"en-US\",\n" +
            "        \"longName\": \"Apple Inc.\",\n" +
            "        \"market\": \"us_market\",\n" +
            "        \"marketCap\": 2006465249280,\n" +
            "        \"marketState\": \"POST\",\n" +
            "        \"messageBoardId\": \"finmb_24937\",\n" +
            "        \"postMarketChange\": -0.25,\n" +
            "        \"postMarketChangePercent\": -0.2130924,\n" +
            "        \"postMarketPrice\": 117.07,\n" +
            "        \"postMarketTime\": 1599686591,\n" +
            "        \"priceEpsCurrentYear\": 36.32198,\n" +
            "        \"priceHint\": 2,\n" +
            "        \"priceToBook\": 27.81413,\n" +
            "        \"quoteSourceName\": \"Nasdaq Real Time Price\",\n" +
            "        \"quoteType\": \"EQUITY\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"regularMarketChange\": 4.5,\n" +
            "        \"regularMarketChangePercent\": 3.9886546,\n" +
            "        \"regularMarketDayHigh\": 119.14,\n" +
            "        \"regularMarketDayLow\": 115.26,\n" +
            "        \"regularMarketDayRange\": \"115.26 - 119.14\",\n" +
            "        \"regularMarketOpen\": 117.26,\n" +
            "        \"regularMarketPreviousClose\": 112.82,\n" +
            "        \"regularMarketPrice\": 117.32,\n" +
            "        \"regularMarketTime\": 1599681602,\n" +
            "        \"regularMarketVolume\": 168404235,\n" +
            "        \"sharesOutstanding\": 17102499840,\n" +
            "        \"shortName\": \"Apple Inc.\",\n" +
            "        \"sourceInterval\": 15,\n" +
            "        \"symbol\": \"AAPL\",\n" +
            "        \"tradeable\": false,\n" +
            "        \"trailingAnnualDividendRate\": 0.782,\n" +
            "        \"trailingAnnualDividendYield\": 0.0069313953,\n" +
            "        \"trailingPE\": 35.59466,\n" +
            "        \"triggerable\": true,\n" +
            "        \"twoHundredDayAverage\": 85.99835,\n" +
            "        \"twoHundredDayAverageChange\": 31.321648,\n" +
            "        \"twoHundredDayAverageChangePercent\": 0.3642122\n" +
            "      },\n" +
            "      {\n" +
            "        \"ask\": 211.63,\n" +
            "        \"askSize\": 9,\n" +
            "        \"averageDailyVolume10Day\": 43250000,\n" +
            "        \"averageDailyVolume3Month\": 35562815,\n" +
            "        \"bid\": 211.25,\n" +
            "        \"bidSize\": 9,\n" +
            "        \"bookValue\": 15.626,\n" +
            "        \"currency\": \"USD\",\n" +
            "        \"displayName\": \"Microsoft\",\n" +
            "        \"dividendDate\": 1599696000,\n" +
            "        \"earningsTimestamp\": 1595434164,\n" +
            "        \"earningsTimestampEnd\": 1603742400,\n" +
            "        \"earningsTimestampStart\": 1603310400,\n" +
            "        \"epsCurrentYear\": 6.46,\n" +
            "        \"epsForward\": 7.34,\n" +
            "        \"epsTrailingTwelveMonths\": 5.76,\n" +
            "        \"esgPopulated\": false,\n" +
            "        \"exchange\": \"NMS\",\n" +
            "        \"exchangeDataDelayedBy\": 0,\n" +
            "        \"exchangeTimezoneName\": \"America/New_York\",\n" +
            "        \"exchangeTimezoneShortName\": \"EDT\",\n" +
            "        \"fiftyDayAverage\": 212.50658,\n" +
            "        \"fiftyDayAverageChange\": -1.2165833,\n" +
            "        \"fiftyDayAverageChangePercent\": -0.0057249204,\n" +
            "        \"fiftyTwoWeekHigh\": 232.86,\n" +
            "        \"fiftyTwoWeekHighChange\": -21.570007,\n" +
            "        \"fiftyTwoWeekHighChangePercent\": -0.092630796,\n" +
            "        \"fiftyTwoWeekLow\": 132.52,\n" +
            "        \"fiftyTwoWeekLowChange\": 78.76999,\n" +
            "        \"fiftyTwoWeekLowChangePercent\": 0.59440076,\n" +
            "        \"fiftyTwoWeekRange\": \"132.52 - 232.86\",\n" +
            "        \"financialCurrency\": \"USD\",\n" +
            "        \"firstTradeDateMilliseconds\": 511108200000,\n" +
            "        \"forwardPE\": 28.786102,\n" +
            "        \"fullExchangeName\": \"NasdaqGS\",\n" +
            "        \"gmtOffSetMilliseconds\": -14400000,\n" +
            "        \"language\": \"en-US\",\n" +
            "        \"longName\": \"Microsoft Corporation\",\n" +
            "        \"market\": \"us_market\",\n" +
            "        \"marketCap\": 1598968692736,\n" +
            "        \"marketState\": \"POST\",\n" +
            "        \"messageBoardId\": \"finmb_21835\",\n" +
            "        \"postMarketChange\": -61.5672,\n" +
            "        \"postMarketChangePercent\": -29.13872,\n" +
            "        \"postMarketPrice\": 149.7228,\n" +
            "        \"postMarketTime\": 1599686588,\n" +
            "        \"priceEpsCurrentYear\": 32.707428,\n" +
            "        \"priceHint\": 2,\n" +
            "        \"priceToBook\": 13.521694,\n" +
            "        \"quoteSourceName\": \"Nasdaq Real Time Price\",\n" +
            "        \"quoteType\": \"EQUITY\",\n" +
            "        \"region\": \"US\",\n" +
            "        \"regularMarketChange\": 8.62999,\n" +
            "        \"regularMarketChangePercent\": 4.2583585,\n" +
            "        \"regularMarketDayHigh\": 214.8399,\n" +
            "        \"regularMarketDayLow\": 206.7,\n" +
            "        \"regularMarketDayRange\": \"206.7 - 214.8399\",\n" +
            "        \"regularMarketOpen\": 207.6,\n" +
            "        \"regularMarketPreviousClose\": 202.66,\n" +
            "        \"regularMarketPrice\": 211.29,\n" +
            "        \"regularMarketTime\": 1599681601,\n" +
            "        \"regularMarketVolume\": 43764495,\n" +
            "        \"sharesOutstanding\": 7567649792,\n" +
            "        \"shortName\": \"Microsoft Corporation\",\n" +
            "        \"sourceInterval\": 15,\n" +
            "        \"symbol\": \"MSFT\",\n" +
            "        \"tradeable\": false,\n" +
            "        \"trailingAnnualDividendRate\": 2.04,\n" +
            "        \"trailingAnnualDividendYield\": 0.01006612,\n" +
            "        \"trailingPE\": 36.68229,\n" +
            "        \"triggerable\": true,\n" +
            "        \"twoHundredDayAverage\": 186.7529,\n" +
            "        \"twoHundredDayAverageChange\": 24.537094,\n" +
            "        \"twoHundredDayAverageChangePercent\": 0.13138802\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    private JsonUtils() {

    }

    public static ArrayList<Quote> extractQuotes() {

        ArrayList<Quote> quotes = new ArrayList<>();

        try {

            // Create a JSONObject from the SAMPLE_JSON_RESPONSE string
            JSONObject jsonObject = new JSONObject(SAMPLE_JSON_STRING);
            JSONObject quoteResponse = jsonObject.getJSONObject("quoteResponse");

            JSONArray quoteArray = quoteResponse.getJSONArray("result");

            //For each quote in the quoteArray
            for (int i = 0; i< quoteArray.length(); i++) {

                //Get a single quote at position i within the list of quotes
                JSONObject currentStock = quoteArray.getJSONObject(i);

                //  #1 Extract the value for the key called "displayName"
                String displayName = currentStock.getString("displayName");

                //  #2 Extract the value for the key called "ask"
                double askPrice = currentStock.getDouble("ask");

                //  Generate one quote with parsed data
                Quote quote = new Quote(displayName, askPrice);

                Log.e(LOG_TAG, "DisplayName: " + displayName
                        + "\n" + "Ask" + askPrice);
                //Add the new quote to the list of quotes
                quotes.add(quote);

            }

        } catch (JSONException e) {

            e.printStackTrace();

        }

        return quotes;

    }

}
