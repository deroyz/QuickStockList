package com.example.quickstocklist;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteAdapterViewHolder> {

    List<Quote> mQuoteData;
    Context mContext;

    public QuoteAdapter(Context context) {
        this.mContext = context;

    }

    @NonNull
    @Override
    public QuoteAdapter.QuoteAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.quote_list_item, viewGroup, false);
        return new QuoteAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteAdapter.QuoteAdapterViewHolder holder, int position) {

        String mDisplayName = JsonUtils.extractQuotes().get(position).getDisplayName();
        double mAskPrice = JsonUtils.extractQuotes().get(position).getAskPrice();

        holder.mDisplayNameTextView.setText(mDisplayName);
        holder.mAskPriceTextView.setText(String.valueOf(mAskPrice));

    }

    @Override
    public int getItemCount() {
        mQuoteData.size();
        return mQuoteData.size();
    }

    public class QuoteAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView mDisplayNameTextView;
        public final TextView mAskPriceTextView;

        public QuoteAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mDisplayNameTextView = (TextView) itemView.findViewById(R.id.tv_display_name);
            mAskPriceTextView = (TextView) itemView.findViewById(R.id.tv_ask_price);
        }

    }

    public void setQuoteData(ArrayList<Quote> quoteData) {
        mQuoteData = quoteData;
    }
}
