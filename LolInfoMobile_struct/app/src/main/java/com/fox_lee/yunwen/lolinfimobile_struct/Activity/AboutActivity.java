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

    private TextView tv;
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_detail);

        tv = (TextView) findViewById(R.id.tv_about);
        tv.setText(R.string.license_text);
        //iv.setImageDrawable(R.drawable.);
    }
}
