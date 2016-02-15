package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfimobile_struct.Interface.IndexCallback;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AlgorithmSubAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public enum ITEM_TYPE {
        ITEM_TYPE_IMAGE,
        ITEM_TYPE_TEXT
    }
    String[] values = new String[] { "" };

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    final ArrayList<String> list = new ArrayList<String>();

    private String[] mTitles;
    private static IndexCallback indexCallback;
    private boolean show = false;

    public void onIndexUpdate(IndexCallback indexCallback) {
        this.indexCallback = indexCallback;
    }

    public AlgorithmSubAdapter(Context context, String[] var) {
        //mTitles = context.getResources().getStringArray(R.array.data_structure);
        mTitles = var;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            return new TextViewHolder(mLayoutInflater.inflate(R.layout.item_text_list, parent, false));

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            ((TextViewHolder) holder).mTextView.setText(mTitles[position]);

            ContentAdapter adapter = new ContentAdapter(mContext, values);
            ((TextViewHolder) holder).userList.setAdapter(adapter);

            ((TextViewHolder) holder).mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!show) {
                        ((TextViewHolder) holder).userList.setVisibility(View.GONE);
                        show = true;
                    } else {
                        ((TextViewHolder) holder).userList.setVisibility(View.VISIBLE);
                        show = false;
                    }
                }
            });
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? ITEM_TYPE.ITEM_TYPE_IMAGE.ordinal() : ITEM_TYPE.ITEM_TYPE_TEXT.ordinal();
    }

    @Override
    public int getItemCount() {
        return mTitles == null ? 0 : mTitles.length;
    }


    public static class TextViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.text_view)
        TextView mTextView;
        @Bind(R.id.list_view)
        ListView userList;

        TextViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.cv_item)
        void onItemClick() {
            Log.d("TextViewHolder", "onClick--> position = " + getPosition());
        }
    }
}