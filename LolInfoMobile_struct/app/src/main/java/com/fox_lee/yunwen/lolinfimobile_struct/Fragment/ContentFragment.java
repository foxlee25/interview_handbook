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

import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbFavorite;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbRepo;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

/**
 * Created by Yunwen on 2/11/2016.
 */

//implements View.OnClickListener
public class ContentFragment extends  Fragment {
    private String dataContent;
    private String[] strings;
    private static boolean showingFirst = true;
    public void changeData(String dataContent) {
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
       // ScrollView mRelativelayout = (ScrollView) view.findViewById(R.id.detail_layout);
        TextView tvTitle = (TextView) view.findViewById(R.id.text_title);
        ImageView imageFavorite = (ImageView) view.findViewById(R.id.img_favorite);
        TextView tvQuestion= (TextView) view.findViewById(R.id.text_question);
        Button btnAnswer= (Button) view.findViewById(R.id.btn_getAnswer);
//        Typeface typeFace =Typeface.createFromAsset(getActivity().getAssets(),"fonts/HelveticaNeue.ttf");
//        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/HelveticaNeueMed.ttf");
//        tvTitle.setTypeface(font);
        float length =300/dataContent.length();
        if(length >26) {
            tvTitle.setTextSize(26);
        }else {
            tvTitle.setTextSize(length);
        }
        tvTitle.setText(dataContent);
        tvTitle.setTextColor(getResources().getColor(R.color.colorWhite));

        btnAnswer.setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
        btnAnswer.setTextColor(getResources().getColor(R.color.colorWhite));
        final TextView tvAnswer = (TextView) view.findViewById(R.id.text_getAnswer);
        tvAnswer.setTextColor(getResources().getColor(R.color.colorBlack));
        final ImageView imgAnswer = (ImageView) view.findViewById(R.id.img_getAnswer);

        imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //add to favorite
            int _algorithm_id =0;
            DbRepo repo = new DbRepo(v.getContext());
            DbFavorite dbFavorite = new DbFavorite();
            dbFavorite = repo.getColumnById(_algorithm_id);
            dbFavorite.age = 25;
            dbFavorite.content = "";//should be definition
            dbFavorite.topic = dataContent;
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
        String id = dataContent.toLowerCase().replace(" ", "_") + "_";
        int resId = getActivity().getResources().getIdentifier(id, "array", pack);
        strings = getActivity().getResources().getStringArray(resId);
        Log.d("ContentFragment", " The resource id is: " + id);
//        for(int i = 0; i < strings.length; i++) {
//            Log.d("ContentFragment","The array is: " + strings[i]);
//        }
        AlgorithmRepo repo = new AlgorithmRepo(getActivity());
        Algorithm algorithm = repo.getColumnByTopic(dataContent);
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
}