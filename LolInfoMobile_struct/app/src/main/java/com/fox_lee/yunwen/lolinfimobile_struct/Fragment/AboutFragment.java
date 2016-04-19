package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfomobile_struct.R;

/**
 * Created by Yunwen on 4/18/2016.
 */
public class AboutFragment extends Fragment {
    private TextView tvTitle;
    private TextView tvVersion;
    private TextView tvAuthor;
    private TextView tvLicense;
    private TextView tvJiuzhang;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_about, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvTitle = (TextView) view.findViewById(R.id.tv_about_title);
        tvTitle.setText(R.string.about_title);
        tvVersion = (TextView) view.findViewById(R.id.tv_about_version);
        tvVersion.setText(R.string.about_version);
        tvAuthor = (TextView) view.findViewById(R.id.tv_about_author);
        tvAuthor.setText(R.string.about_author);
        tvJiuzhang = (TextView) view.findViewById(R.id.tv_about_jiuzhang);
        tvJiuzhang.setText(R.string.about_jiuzhang_usage);
        tvLicense = (TextView) view.findViewById(R.id.tv_about_license);
        tvLicense.setText(R.string.about_license);
    }
}
