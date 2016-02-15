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

public class AlgorithmAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
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

    public AlgorithmAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.algorithm);
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new TextViewHolder(mLayoutInflater.inflate(R.layout.item_text, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof TextViewHolder) {
            ((TextViewHolder) holder).mTextView.setText(mTitles[position]);
            ((TextViewHolder) holder).mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mContext instanceof View.OnClickListener) {
                        switch (((TextViewHolder) holder).mTextView.getText().toString()) {
                            case "1.Basics": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.basics));
                                break;
                            case "2.Data Structure": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.data_structure));
                                break;
                            case "3.Basic Sorting": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.basics_sorting));
                                break;
                            case "4.Basic Misc": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.basics_misc));
                                break;
                            case "5.Part II - Coding": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.part_II_coding));
                                break;
                            case "6.String": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.string));
                                break;
                            case "7.Integer Array": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.integer_array));
                                break;
                            case "8.Binary Search": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.binary_search));
                                break;
                            case "9.Math and Bit Manipulation": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.math_and_bit_manipulation));
                                break;
                            case "10.Reverse": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.reverse));
                                break;
                            case "11.Binary Tree": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.binary_tree));
                                break;
                            case "12.Backtracking": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.back_tracking));
                                break;
                            case "13.Dynamic Programing": /* start activity accordingly */
                                ((MainActivity) mContext).startAlgorithmSubFragment(mContext.getResources().getStringArray(R.array.dynamic_programming));
                                break;
                        }
                    }
                }
            });
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
}