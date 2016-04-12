package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fox_lee.yunwen.lolinfimobile_struct.Adapter.SubAdapter;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

/**
 * Created by Yunwen on 2/11/2016.
 */
public class SubFragment extends  Fragment{
    private RecyclerView mRecyclerView;
    private SubAdapter algorithmsubAdapter;
    private String[] dataContent;
    public void changeData(String[] dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        algorithmsubAdapter = new SubAdapter(getActivity(),dataContent);
        mRecyclerView.setAdapter(algorithmsubAdapter);
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}