package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Activity.MainActivity;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbFavorite;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbRepo;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Yunwen on 2/11/2016.
 */

//implements View.OnClickListener
public class ContentFragment extends  Fragment {
    private String data;
    private ArrayList<String> dataContent;
    private String[] strings;
    private static boolean showingFirst = true;
    public void changeData(String data, ArrayList dataContent ) {
        this.data = data;
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_content_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showingFirst = true;
        TextView tvTitle = (TextView) view.findViewById(R.id.text_title);
        ImageView imageFavorite = (ImageView) view.findViewById(R.id.img_favorite);
        TextView tvQuestion= (TextView) view.findViewById(R.id.text_question);
        Button btnAnswer= (Button) view.findViewById(R.id.btn_getAnswer);
        Button btnNext = (Button) view.findViewById(R.id.move_next);
        Button btnPre = (Button) view.findViewById(R.id.move_pre);
        float length =500/ data.length();
        if(length >25) {
            tvTitle.setTextSize(25);
        }else {
            tvTitle.setTextSize(length);
        }
        tvTitle.setText(data);
        tvTitle.setTextColor(getResources().getColor(R.color.colorBlack));
        btnAnswer.setTextColor(getResources().getColor(R.color.colorWhite));
        final TextView tvAnswer = (TextView) view.findViewById(R.id.text_getAnswer);
        tvAnswer.setTextColor(getResources().getColor(R.color.colorBlack));
        tvAnswer.setBackgroundColor(getResources().getColor(R.color.colorLightGrey));
        final ImageView imgAnswer = (ImageView) view.findViewById(R.id.img_getAnswer);
        imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //if not exist in the Db then add to favorite
            int _algorithm_id =0;
            DbRepo repo = new DbRepo(v.getContext());
            DbFavorite dbFavorite = new DbFavorite();

            dbFavorite = repo.getColumnById(_algorithm_id);
            dbFavorite.age = 25;
            dbFavorite.content = "";//should be definition
            dbFavorite.topic = data;
            dbFavorite.algorithm_ID=_algorithm_id;

            if(_algorithm_id==0){
                _algorithm_id=repo.insert(dbFavorite);
                Toast.makeText(v.getContext(), "Add to Favorite Menu", Toast.LENGTH_SHORT).show();
            }else{
                repo.update(dbFavorite);
                Toast.makeText(v.getContext(),"Content Record updated",Toast.LENGTH_SHORT).show();
            }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add to favorite
                moveToNext();
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add to favorite
                moveToPrevious();
            }
        });
        btnAnswer.setVisibility(view.VISIBLE);
        imgAnswer.setVisibility(view.VISIBLE);
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (showingFirst) {
                tvAnswer.setVisibility(v.VISIBLE);
                imgAnswer.setVisibility(v.GONE);
                showingFirst = false;
            } else {
                tvAnswer.setVisibility(v.GONE);
                imgAnswer.setVisibility(v.VISIBLE);
                showingFirst = true;
            }
            }
        });
        String pack = getActivity().getPackageName();
        String id = data.toLowerCase().replace(" ", "_") + "_";
        int resId = getActivity().getResources().getIdentifier(id, "array", pack);
        strings = getActivity().getResources().getStringArray(resId);
        AlgorithmRepo repo = new AlgorithmRepo(getActivity());
        Algorithm algorithm = repo.getColumnByTopic(data);

//        tvQuestion.setText(algorithm.content);
//        tvAnswer.setText(algorithm.code);
        tvQuestion.setText(strings[0]);
        tvAnswer.setText(strings[1]);
    }
    private String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }

    private void moveToNext() {
        try{
            int i = dataContent.indexOf(data);
            ((MainActivity) getActivity()).startContent2Fragment(dataContent.get(i+1),dataContent);
        }catch(Exception e){
            Toast.makeText(getActivity(),"Last Content of this group",Toast.LENGTH_SHORT).show();
        }
    }

    private void moveToPrevious() {
        try{
            int i = dataContent.indexOf(data);
            ((MainActivity) getActivity()).startContent2Fragment(dataContent.get(i-1),dataContent);
        }catch(Exception e){
            Toast.makeText(getActivity(),"First Content of this group",Toast.LENGTH_SHORT).show();
        }
    }
}