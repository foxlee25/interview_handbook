package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;

import android.app.AlertDialog;
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
import com.fox_lee.yunwen.lolinfimobile_struct.Interface.IndexCallback;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbFavorite;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yunwen on 4/10/2016.
 */
public class DbLoadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
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

    public DbLoadAdapter(Context context, ArrayList<HashMap<String, String>> data) {
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
        try {
            Log.d("DbLoadFragment", data.get(position).get("id"));
            Log.d("DbLoadFragment", data.get(position).get("topic"));
            ((TextViewHolder) holder).mTextView.setText(data.get(position).get("topic"));
            final String dataContent = ((TextViewHolder) holder).mTextView.getText().toString();
            ((TextViewHolder) holder).mImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {
                //delete this page
                AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                alertDialog.setTitle(dataContent);
                alertDialog.setMessage(mContext.getString(R.string.del_favorite_confirm));
                alertDialog.setIcon(R.drawable.menu_icon);
                // Setting OK Button
                alertDialog.setButton("No", new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int which) {
                     // cancel dialog
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
                    ((MainActivity) mContext).startDbLoadFragment("");
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
