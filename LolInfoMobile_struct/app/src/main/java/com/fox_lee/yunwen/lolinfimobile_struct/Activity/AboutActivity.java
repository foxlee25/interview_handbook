package com.fox_lee.yunwen.lolinfimobile_struct.Activity;

import android.app.FragmentManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfomobile_struct.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Yunwen on 2/24/2016.
 */
public class AboutActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

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
    }
}
