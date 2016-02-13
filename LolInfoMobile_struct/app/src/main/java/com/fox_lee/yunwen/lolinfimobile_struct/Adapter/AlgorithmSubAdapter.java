package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfimobile_struct.Activity.MainActivity;
import com.fox_lee.yunwen.lolinfimobile_struct.Interface.IndexCallback;
import com.fox_lee.yunwen.lolinfomobile_struct.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AlgorithmSubAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public enum ITEM_TYPE {
        ITEM_TYPE_IMAGE,
        ITEM_TYPE_TEXT
    }

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;
    private static IndexCallback indexCallback;

    public void onIndexUpdate(IndexCallback indexCallback) {
        this.indexCallback = indexCallback;
    }

    public AlgorithmSubAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.data_structure);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_TYPE.ITEM_TYPE_IMAGE.ordinal()) {
            return new ImageViewHolder(mLayoutInflater.inflate(R.layout.item_image, parent, false));
        } else {
            return new TextViewHolder(mLayoutInflater.inflate(R.layout.item_text, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof TextViewHolder) {
            ((TextViewHolder) holder).mTextView.setText(mTitles[position]);

        } else if (holder instanceof ImageViewHolder) {
            ((ImageViewHolder) holder).mTextView.setText(mTitles[position]);
            Picasso
                    .with(mContext)
                    .load("http://7xiys0.com1.z0.glb.clouddn.com/gitbook143117686469.png")
                    .fit()
                    .into(((ImageViewHolder) holder).mImageView);
        }

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

        TextViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.cv_item)
        void onItemClick() {
            Log.d("TextViewHolder", "onClick--> position = " + getPosition());
        }
    }
    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.text_view)
        TextView mTextView;
        @Bind(R.id.image_view)
        ImageView mImageView;

        ImageViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.cv_item)
        void onItemClick() {
            Log.d("ImageViewHolder", "onClick--> position = " + getPosition());
        }
    }
}