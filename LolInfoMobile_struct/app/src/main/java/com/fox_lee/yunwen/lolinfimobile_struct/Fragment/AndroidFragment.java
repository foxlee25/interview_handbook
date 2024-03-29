package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flurry.android.FlurryAgent;
import com.fox_lee.yunwen.lolinfimobile_struct.Adapter.AndroidAdapter;
import com.fox_lee.yunwen.lolinfimobile_struct.Adapter.JavaAdapter;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yunwen on 2/11/2016.
 */
public class AndroidFragment extends  Fragment{
    RecyclerView mRecyclerView;
    private AndroidAdapter javaAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //display details
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        javaAdapter = new AndroidAdapter(getActivity());
        mRecyclerView.setAdapter(javaAdapter);
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}