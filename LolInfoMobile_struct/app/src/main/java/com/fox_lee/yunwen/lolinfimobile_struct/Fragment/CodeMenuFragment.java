package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fox_lee.yunwen.lolinfimobile_struct.Adapter.CodeMenuAdapter;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

/**
 * Created by Yunwen on 2/10/2016.
 */
public class CodeMenuFragment extends Fragment{
    RecyclerView mRecyclerView;
    private CodeMenuAdapter codeInterviewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        codeInterviewAdapter = new CodeMenuAdapter(getActivity());
        mRecyclerView.setAdapter(codeInterviewAdapter);
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}
