package com.example.quickstocklist;

import android.content.Context;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteAdapterViewHolder> {

    private int mNumberItems;
    ArrayList<Quote> mQuoteData;

    public QuoteAdapter(int numberOfItems, ArrayList<Quote> quotes) {
        mNumberItems = numberOfItems;
        mQuoteData = quotes;
    }

    @NonNull
    @Override
    public QuoteAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.quote_list_item, viewGroup, false);
        return new QuoteAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuoteAdapterViewHolder holder, int position) {


        String mDisplayName = mQuoteData.get(position).getDisplayName();
        double mAskPrice = mQuoteData.get(position).getAskPrice();

        holder.mDisplayNameTextView.setText(mDisplayName);
        holder.mAskPriceTextView.setText(String.valueOf(mAskPrice));

    }

    @Override
    public int getItemCount() {

        return mNumberItems;

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

}
