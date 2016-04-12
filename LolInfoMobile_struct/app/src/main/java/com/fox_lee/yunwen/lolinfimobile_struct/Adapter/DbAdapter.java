package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Activity.MainActivity;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Interface.IndexCallback;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Yunwen on 4/10/2016.
 */
public class DbAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public enum ITEM_TYPE {
        ITEM_TYPE_IMAGE,
        ITEM_TYPE_TEXT
    }

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private String[] mTitles;
    ArrayList<HashMap<String, String>> data;
    private static IndexCallback indexCallback;
    public void onIndexUpdate(IndexCallback indexCallback) {
        this.indexCallback = indexCallback;
    }

    public DbAdapter(Context context, ArrayList<HashMap<String, String>> data) {
        mTitles = context.getResources().getStringArray(R.array.titles);
        this.data = data;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TextViewHolder(mLayoutInflater.inflate(R.layout.view_db_entry, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder,  int position) {
//        if (holder instanceof TextViewHolder)
//            ((TextViewHolder) holder).mTextView.setText(mTitles[position]);
        try {
            Log.d("DbFragment", data.get(position).get("id"));
            Log.d("DbFragment", data.get(position).get("topic"));
            ((TextViewHolder) holder).mTextView.setText(data.get(position).get("topic"));
            final String dataContent = ((TextViewHolder) holder).mTextView.getText().toString();
            ((TextViewHolder) holder).mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {   //goto this page
                    if (!dataContent.isEmpty()) {
                        ((MainActivity) mContext).startContentFragment(dataContent);
                    } else {
                        Toast.makeText(mContext, "Coming soon", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            ((TextViewHolder) holder).mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {
//delete this page
                 AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                    alertDialog.setTitle(dataContent);
                    alertDialog.setMessage("Are you sure to delete?");
                    alertDialog.setIcon(R.drawable.menu_icon);
                    // Setting OK Button
                    alertDialog.setButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Write your code here to execute after dialog close
                            dialog.cancel();
                        }
                    });
                    alertDialog.setButton2("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Write your code here to execute after dialog closed
                            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
                            Algorithm algorithm = new Algorithm();
                            algorithm = repo.getColumnByTopic(dataContent);
                            repo.delete(algorithm.algorithm_ID);
                            Toast.makeText(mContext, "The " + dataContent + " deleted", Toast.LENGTH_SHORT).show();
                            //restart  DbFragment
                            ((MainActivity) mContext).startDbFragment();
                            Toast.makeText(mContext, "You clicked on OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();// Showing Alert Message
                }
            });
        } catch (Exception e) {
            Log.d("FragmentAdapter", e.toString());
        }
    }
    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? ITEM_TYPE.ITEM_TYPE_IMAGE.ordinal() : ITEM_TYPE.ITEM_TYPE_TEXT.ordinal();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        // @Bind(R.id.text_view)
        TextView mTextView;
        ImageView mImageView;

        TextViewHolder(View view) {
            super(view);
            mTextView = (TextView) itemView.findViewById(R.id.algorithm_name);
            mImageView = (ImageView) itemView.findViewById(R.id.algorithm_delete);
        }
    }
}
