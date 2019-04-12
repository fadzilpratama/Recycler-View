package com.example.macbookpro.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.ViewHolder>{
    private Context context;
    private LayoutInflater mLayoutInflater;
    private List<String> mStringList;

    public WordListAdapter (Context context, LinkedList<String> mStringList){
        this.context = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mStringList = mStringList;
    }
    @NonNull
    @Override
    public WordListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mLayoutInflater.inflate(R.layout.item_word,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.ViewHolder viewHolder, int i) {
    String mCurrent = mStringList.get(i);
    viewHolder.titleText.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText=itemView.findViewById(R.id.word);
        }
    }
}
