package com.fox_lee.yunwen.lolinfimobile_struct.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfomobile_struct.R;

/**
 * Created by Yunwen on 2/24/2016.
 */
public class AboutActivity extends AppCompatActivity {

    private TextView tvTitle;
    private TextView tvVersion;
    private TextView tvAuthor;
    private TextView tvLicense;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tvTitle = (TextView) findViewById(R.id.tv_about_title);
        tvTitle.setText(R.string.about_title);
        tvVersion = (TextView) findViewById(R.id.tv_about_version);
        tvVersion.setText(R.string.about_version);
        tvAuthor = (TextView) findViewById(R.id.tv_about_author);
        tvAuthor.setText(R.string.about_author);
        tvLicense = (TextView) findViewById(R.id.tv_about_license);
        tvLicense.setText(R.string.about_license);
        //iv.setImageDrawable(R.drawable.);
    }
}
