package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfimobile_struct.Model.HashMapContent;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.HashMap;

/**
 * Created by Yunwen on 2/11/2016.
 */
public class ContentFragment extends  Fragment{
    String dataContent;
    public void changeData(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_text_list, container, false);
        Log.d("Fragment", "Content Fragment Started");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //set textView and imageView
        Log.d("ContentFragment", "The title is: " + dataContent);
        HashMapContent hashMapContent = new HashMapContent();
        HashMap hm =  hashMapContent.getAir();
        Log.d("ContentFragment","The content is: "+ hm.get(dataContent).toString());

        TextView tv = (TextView) view.findViewById(R.id.text_view);
        tv.setText(hm.get(dataContent).toString());
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}
