package com.example.quickstocklist.retrofit.quote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuoteResponseResult {

    @SerializedName("ask")
    @Expose
    private Double ask;
    @SerializedName("askSize")
    @Expose
    private Integer askSize;
    @SerializedName("averageDailyVolume10Day")
    @Expose
    private Integer averageDailyVolume10Day;
    @SerializedName("averageDailyVolume3Month")
    @Expose
    private Integer averageDailyVolume3Month;
    @SerializedName("bid")
    @Expose
    private Double bid;
    @SerializedName("bidSize")
    @Expose
    private Integer bidSize;
    @SerializedName("bookValue")
    @Expose
    private Double bookValue;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("dividendDate")
    @Expose
    private Integer dividendDate;
    @SerializedName("earningsTimestamp")
    @Expose
    private Integer earningsTimestamp;
    @SerializedName("earningsTimestampEnd")
    @Expose
    private Integer earningsTimestampEnd;
    @SerializedName("earningsTimestampStart")
    @Expose
    private Integer earningsTimestampStart;
    @SerializedName("epsCurrentYear")
    @Expose
    private Double epsCurrentYear;
    @SerializedName("epsForward")
    @Expose
    private Double epsForward;
    @SerializedName("epsTrailingTwelveMonths")
    @Expose
    private Double epsTrailingTwelveMonths;
    @SerializedName("esgPopulated")
    @Expose
    private Boolean esgPopulated;
    @SerializedName("exchange")
    @Expose
    private String exchange;
    @SerializedName("exchangeDataDelayedBy")
    @Expose
    private Integer exchangeDataDelayedBy;
    @SerializedName("exchangeTimezoneName")
    @Expose
    private String exchangeTimezoneName;
    @SerializedName("exchangeTimezoneShortName")
    @Expose
    private String exchangeTimezoneShortName;
    @SerializedName("fiftyDayAverage")
    @Expose
    private Double fiftyDayAverage;
    @SerializedName("fiftyDayAverageChange")
    @Expose
    private Double fiftyDayAverageChange;
    @SerializedName("fiftyDayAverageChangePercent")
    @Expose
    private Double fiftyDayAverageChangePercent;
    @SerializedName("fiftyTwoWeekHigh")
    @Expose
    private Double fiftyTwoWeekHigh;
    @SerializedName("fiftyTwoWeekHighChange")
    @Expose
    private Double fiftyTwoWeekHighChange;
    @SerializedName("fiftyTwoWeekHighChangePercent")
    @Expose
    private Double fiftyTwoWeekHighChangePercent;
    @SerializedName("fiftyTwoWeekLow")
    @Expose
    private Double fiftyTwoWeekLow;
    @SerializedName("fiftyTwoWeekLowChange")
    @Expose
    private Double fiftyTwoWeekLowChange;
    @SerializedName("fiftyTwoWeekLowChangePercent")
    @Expose
    private Double fiftyTwoWeekLowChangePercent;
    @SerializedName("fiftyTwoWeekRange")
    @Expose
    private String fiftyTwoWeekRange;
    @SerializedName("financialCurrency")
    @Expose
    private String financialCurrency;
    @SerializedName("firstTradeDateMilliseconds")
    @Expose
    private Long firstTradeDateMilliseconds;
    @SerializedName("forwardPE")
    @Expose
    private Double forwardPE;
    @SerializedName("fullExchangeName")
    @Expose
    private String fullExchangeName;
    @SerializedName("gmtOffSetMilliseconds")
    @Expose
    private Integer gmtOffSetMilliseconds;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("marketCap")
    @Expose
    private Long marketCap;
    @SerializedName("marketState")
    @Expose
    private String marketState;
    @SerializedName("messageBoardId")
    @Expose
    private String messageBoardId;
    @SerializedName("postMarketChange")
    @Expose
    private Double postMarketChange;
    @SerializedName("postMarketChangePercent")
    @Expose
    private Double postMarketChangePercent;
    @SerializedName("postMarketPrice")
    @Expose
    private Double postMarketPrice;
    @SerializedName("postMarketTime")
    @Expose
    private Integer postMarketTime;
    @SerializedName("priceEpsCurrentYear")
    @Expose
    private Double priceEpsCurrentYear;
    @SerializedName("priceHint")
    @Expose
    private Integer priceHint;
    @SerializedName("priceToBook")
    @Expose
    private Double priceToBook;
    @SerializedName("quoteSourceName")
    @Expose
    private String quoteSourceName;
    @SerializedName("quoteType")
    @Expose
    private String quoteType;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("regularMarketChange")
    @Expose
    private Double regularMarketChange;
    @SerializedName("regularMarketChangePercent")
    @Expose
    private Double regularMarketChangePercent;
    @SerializedName("regularMarketDayHigh")
    @Expose
    private Double regularMarketDayHigh;
    @SerializedName("regularMarketDayLow")
    @Expose
    private Double regularMarketDayLow;
    @SerializedName("regularMarketDayRange")
    @Expose
    private String regularMarketDayRange;
    @SerializedName("regularMarketOpen")
    @Expose
    private Double regularMarketOpen;
    @SerializedName("regularMarketPreviousClose")
    @Expose
    private Double regularMarketPreviousClose;
    @SerializedName("regularMarketPrice")
    @Expose
    private Double regularMarketPrice;
    @SerializedName("regularMarketTime")
    @Expose
    private Integer regularMarketTime;
    @SerializedName("regularMarketVolume")
    @Expose
    private Integer regularMarketVolume;
    @SerializedName("sharesOutstanding")
    @Expose
    private Long sharesOutstanding;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("sourceInterval")
    @Expose
    private Integer sourceInterval;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("tradeable")
    @Expose
    private Boolean tradeable;
    @SerializedName("trailingAnnualDividendRate")
    @Expose
    private Double trailingAnnualDividendRate;
    @SerializedName("trailingAnnualDividendYield")
    @Expose
    private Double trailingAnnualDividendYield;
    @SerializedName("trailingPE")
    @Expose
    private Double trailingPE;
    @SerializedName("triggerable")
    @Expose
    private Boolean triggerable;
    @SerializedName("twoHundredDayAverage")
    @Expose
    private Double twoHundredDayAverage;
    @SerializedName("twoHundredDayAverageChange")
    @Expose
    private Double twoHundredDayAverageChange;
    @SerializedName("twoHundredDayAverageChangePercent")
    @Expose
    private Double twoHundredDayAverageChangePercent;

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Integer getAskSize() {
        return askSize;
    }

    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    public Integer getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public void setAverageDailyVolume10Day(Integer averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public Integer getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    public void setAverageDailyVolume3Month(Integer averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Integer getBidSize() {
        return bidSize;
    }

    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    public Double getBookValue() {
        return bookValue;
    }

    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(Integer dividendDate) {
        this.dividendDate = dividendDate;
    }

    public Integer getEarningsTimestamp() {
        return earningsTimestamp;
    }

    public void setEarningsTimestamp(Integer earningsTimestamp) {
        this.earningsTimestamp = earningsTimestamp;
    }

    public Integer getEarningsTimestampEnd() {
        return earningsTimestampEnd;
    }

    public void setEarningsTimestampEnd(Integer earningsTimestampEnd) {
        this.earningsTimestampEnd = earningsTimestampEnd;
    }

    public Integer getEarningsTimestampStart() {
        return earningsTimestampStart;
    }

    public void setEarningsTimestampStart(Integer earningsTimestampStart) {
        this.earningsTimestampStart = earningsTimestampStart;
    }

    public Double getEpsCurrentYear() {
        return epsCurrentYear;
    }

    public void setEpsCurrentYear(Double epsCurrentYear) {
        this.epsCurrentYear = epsCurrentYear;
    }

    public Double getEpsForward() {
        return epsForward;
    }

    public void setEpsForward(Double epsForward) {
        this.epsForward = epsForward;
    }

    public Double getEpsTrailingTwelveMonths() {
        return epsTrailingTwelveMonths;
    }

    public void setEpsTrailingTwelveMonths(Double epsTrailingTwelveMonths) {
        this.epsTrailingTwelveMonths = epsTrailingTwelveMonths;
    }

    public Boolean getEsgPopulated() {
        return esgPopulated;
    }

    public void setEsgPopulated(Boolean esgPopulated) {
        this.esgPopulated = esgPopulated;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    public void setExchangeDataDelayedBy(Integer exchangeDataDelayedBy) {
        this.exchangeDataDelayedBy = exchangeDataDelayedBy;
    }

    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    public String getExchangeTimezoneShortName() {
        return exchangeTimezoneShortName;
    }

    public void setExchangeTimezoneShortName(String exchangeTimezoneShortName) {
        this.exchangeTimezoneShortName = exchangeTimezoneShortName;
    }

    public Double getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    public void setFiftyDayAverage(Double fiftyDayAverage) {
        this.fiftyDayAverage = fiftyDayAverage;
    }

    public Double getFiftyDayAverageChange() {
        return fiftyDayAverageChange;
    }

    public void setFiftyDayAverageChange(Double fiftyDayAverageChange) {
        this.fiftyDayAverageChange = fiftyDayAverageChange;
    }

    public Double getFiftyDayAverageChangePercent() {
        return fiftyDayAverageChangePercent;
    }

    public void setFiftyDayAverageChangePercent(Double fiftyDayAverageChangePercent) {
        this.fiftyDayAverageChangePercent = fiftyDayAverageChangePercent;
    }

    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public Double getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    public void setFiftyTwoWeekHighChange(Double fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    public Double getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    public void setFiftyTwoWeekHighChangePercent(Double fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public Double getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    public void setFiftyTwoWeekLowChange(Double fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    public Double getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    public void setFiftyTwoWeekLowChangePercent(Double fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    public String getFinancialCurrency() {
        return financialCurrency;
    }

    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    public Long getFirstTradeDateMilliseconds() {
        return firstTradeDateMilliseconds;
    }

    public void setFirstTradeDateMilliseconds(Long firstTradeDateMilliseconds) {
        this.firstTradeDateMilliseconds = firstTradeDateMilliseconds;
    }

    public Double getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(Double forwardPE) {
        this.forwardPE = forwardPE;
    }

    public String getFullExchangeName() {
        return fullExchangeName;
    }

    public void setFullExchangeName(String fullExchangeName) {
        this.fullExchangeName = fullExchangeName;
    }

    public Integer getGmtOffSetMilliseconds() {
        return gmtOffSetMilliseconds;
    }

    public void setGmtOffSetMilliseconds(Integer gmtOffSetMilliseconds) {
        this.gmtOffSetMilliseconds = gmtOffSetMilliseconds;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public String getMarketState() {
        return marketState;
    }

    public void setMarketState(String marketState) {
        this.marketState = marketState;
    }

    public String getMessageBoardId() {
        return messageBoardId;
    }

    public void setMessageBoardId(String messageBoardId) {
        this.messageBoardId = messageBoardId;
    }

    public Double getPostMarketChange() {
        return postMarketChange;
    }

    public void setPostMarketChange(Double postMarketChange) {
        this.postMarketChange = postMarketChange;
    }

    public Double getPostMarketChangePercent() {
        return postMarketChangePercent;
    }

    public void setPostMarketChangePercent(Double postMarketChangePercent) {
        this.postMarketChangePercent = postMarketChangePercent;
    }

    public Double getPostMarketPrice() {
        return postMarketPrice;
    }

    public void setPostMarketPrice(Double postMarketPrice) {
        this.postMarketPrice = postMarketPrice;
    }

    public Integer getPostMarketTime() {
        return postMarketTime;
    }

    public void setPostMarketTime(Integer postMarketTime) {
        this.postMarketTime = postMarketTime;
    }

    public Double getPriceEpsCurrentYear() {
        return priceEpsCurrentYear;
    }

    public void setPriceEpsCurrentYear(Double priceEpsCurrentYear) {
        this.priceEpsCurrentYear = priceEpsCurrentYear;
    }

    public Integer getPriceHint() {
        return priceHint;
    }

    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    public Double getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(Double priceToBook) {
        this.priceToBook = priceToBook;
    }

    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    public void setQuoteSourceName(String quoteSourceName) {
        this.quoteSourceName = quoteSourceName;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Double getRegularMarketChange() {
        return regularMarketChange;
    }

    public void setRegularMarketChange(Double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public Double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(Double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public Double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public Double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(Double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    public Double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public void setRegularMarketOpen(Double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    public Double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public void setRegularMarketPreviousClose(Double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Integer getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(Integer regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public Long getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(Long sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getSourceInterval() {
        return sourceInterval;
    }

    public void setSourceInterval(Integer sourceInterval) {
        this.sourceInterval = sourceInterval;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Boolean getTradeable() {
        return tradeable;
    }

    public void setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
    }

    public Double getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    public void setTrailingAnnualDividendRate(Double trailingAnnualDividendRate) {
        this.trailingAnnualDividendRate = trailingAnnualDividendRate;
    }

    public Double getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    public void setTrailingAnnualDividendYield(Double trailingAnnualDividendYield) {
        this.trailingAnnualDividendYield = trailingAnnualDividendYield;
    }

    public Double getTrailingPE() {
        return trailingPE;
    }

    public void setTrailingPE(Double trailingPE) {
        this.trailingPE = trailingPE;
    }

    public Boolean getTriggerable() {
        return triggerable;
    }

    public void setTriggerable(Boolean triggerable) {
        this.triggerable = triggerable;
    }

    public Double getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    public void setTwoHundredDayAverage(Double twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    public Double getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    public void setTwoHundredDayAverageChange(Double twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    public Double getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    public void setTwoHundredDayAverageChangePercent(Double twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

}

