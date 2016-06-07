package com.fox_lee.yunwen.lolinfimobile_struct.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.provider.SyncStateContract;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.flurry.android.FlurryAgent;
import com.fox_lee.yunwen.lolinfimobile_struct.Constants.Key;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AboutFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AndroidFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.ContentFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbLoadFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.FeedbackFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.JavaFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.SubFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbFavorite;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DbRepo;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.SlidingLayout;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public enum AppStart {
        FIRST_TIME, FIRST_TIME_VERSION, NORMAL;
    }
    ProgressDialog dialog = null;
    int counter = 0;
    Thread t =null;
    private static final String LAST_APP_VERSION = "last_app_version";
    private SlidingLayout slidingLayout;
    boolean doubleBackToExitPressedOnce = false;
    LinearLayout ll1;
    LinearLayout ll2;
    RelativeLayout lla;
    LinearLayout ll3;
    LinearLayout ll4;
    LinearLayout ll5;
    LinearLayout ll6;
    LinearLayout ll7;
    TextView tv1;
    TextView tv2;
    TextView tva;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init Flurry
        FlurryAgent.init(this, Key.FLURRY_API_KEY);
        FlurryAgent.onStartSession(this, Key.FLURRY_API_KEY);
        FlurryAgent.setLogEnabled(true);
        FlurryAgent.setLogEvents(true);
        FlurryAgent.setLogLevel(Log.VERBOSE);

        createView();//create icon in the slide menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menu_icon);
        LinearLayout appBarLayout = (LinearLayout) findViewById(R.id.menu_layout);
        slidingLayout = (SlidingLayout) findViewById(R.id.slidingLayout);
        slidingLayout.setScrollEvent(appBarLayout);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // click to achieve menu left slide layout，click again to hide left slide layout
                if (slidingLayout.isLeftLayoutVisible()) {
                    slidingLayout.scrollToRightLayout();
                } else {
                    slidingLayout.scrollToLeftLayout();
                }
            }
        });
        setListener();//set onclick listener in the slide menu
        changeColor();
        toolbar.getMenu().clear();
        this.startAlgorithmFragment("");

        switch (checkAppStart()) {
            case NORMAL:
                // We don't want to get on the user's nerves
                t = new Thread() {
                    public void run() {
//                  register();
                        try {
                            while(counter<1){
                                //do something
                                updateGallery(0);
                                Thread.sleep(5000*2);
                                updateGallery(1);
                                Thread.sleep(1000*2);
                            }
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                    }
                };
                t.start();
                break;
            case FIRST_TIME_VERSION:
                // TODO show what's new
                break;
            case FIRST_TIME:
                // TODO show a tutorial
                break;
            default:
            break;
        }
}


    private void createView(){
        ll1 = (LinearLayout) findViewById(R.id.rowIconAlgorithm);
        ll2 = (LinearLayout) findViewById(R.id.rowIconJava);
        lla = (RelativeLayout) findViewById(R.id.rowIconAndroid);
        ll3 = (LinearLayout) findViewById(R.id.rowIconFavorite);
        ll4 = (LinearLayout) findViewById(R.id.rowIconAbout);
        ll5 = (LinearLayout) findViewById(R.id.rowIcon5);
        ll6 = (LinearLayout) findViewById(R.id.rowIcon6);
        ll7 = (LinearLayout) findViewById(R.id.rowIcon7);
        tv1 = (TextView) findViewById(R.id.text_rowAlgorithm);
        tv2 = (TextView) findViewById(R.id.text_rowJava);
        tva = (TextView) findViewById(R.id.text_rowAndroid);
        tv3 = (TextView) findViewById(R.id.text_rowIconFavorite);
        tv4 = (TextView) findViewById(R.id.text_rowIconAbout);
        tv5 = (TextView) findViewById(R.id.text_rowIcon5);
        tv7 = (TextView) findViewById(R.id.text_rowIcon7);
    }

    private void setListener(){
        tv1.setOnClickListener(this);tv2.setOnClickListener(this);tva.setOnClickListener(this);tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);tv5.setOnClickListener(this);tv7.setOnClickListener(this);
    }

    private void changeColor(){
//        ll1.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_rowAlgorithm: /** Start a new fragment */
                Snackbar.make(v, "Open Algorithm coding", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                clearBackStack();
                this.startAlgorithmFragment("");
                //Log the timed event when the user starts reading the article
                //setting the third param to true creates a timed event
                FlurryAgent.logEvent("Algorithm");
                // End the timed event, when the user navigates away from article
                FlurryAgent.endTimedEvent("Algorithm");
                break;
            case R.id.text_rowJava: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Open Core Java Question", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startJavaFragment("");
                FlurryAgent.logEvent("Java");
                FlurryAgent.endTimedEvent("Java");
                break;
            case R.id.text_rowAndroid: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Open Core Android Question", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startAndroidFragment();
                FlurryAgent.logEvent("Android");
                FlurryAgent.endTimedEvent("Android");
                break;
            case R.id.text_rowIconFavorite: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open Favorite List", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startDbFragment();
                FlurryAgent.logEvent("Favorite List");
                FlurryAgent.endTimedEvent("Favorite List");
                break;
            case R.id.text_rowIconAbout: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open About", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startAboutFragment();
                FlurryAgent.logEvent("About");
                FlurryAgent.endTimedEvent("About");
                break;
            case R.id.text_rowIcon5: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open Feedback", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startFeedbackFragment("");
                FlurryAgent.logEvent("Feedback");
                FlurryAgent.endTimedEvent("Feedback");
                break;
            default:
                Snackbar.make(v, "Coming Soon", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
        }
        slidingLayout.scrollToRightLayout();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater mnuInflater = getMenuInflater();
        mnuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            // START THE about activity
            startAboutFragment();
            return true;
        }
        if (id == R.id.alarm) {
            // to do
            Intent myIntent = new Intent(MainActivity.this, AlarmActivity.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void clearBackStack() {
        FragmentManager manager = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 0: {
                ++counter;
                dialog = new ProgressDialog(this);
                if(counter==1){
                    dialog.setMessage("Registering...");
                }else{
                    dialog.setMessage("Registered successfully");
                }
                dialog.setIndeterminate(true);
                dialog.setCancelable(true);

            }

        }
        return dialog;
    }
    @Override
    public void onStop()
    {
        super.onStop();
        FlurryAgent.onEndSession(this);
    }

    @Override
    public void onBackPressed(){
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 1) {
            fm.popBackStack();
        }
        else {
            //super.onBackPressed();
        }
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Quickly click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 350);
    }


    public void startContentFragment(String var, ArrayList array){
        ContentFragment contentFragment = new ContentFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, contentFragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
        contentFragment.changeData(var,array);
    }

    public void startContent2Fragment(String var, ArrayList array){
        ContentFragment contentFragment = new ContentFragment();
        getFragmentManager().popBackStack();
        getFragmentManager().beginTransaction().replace(R.id.container, contentFragment, "SubFragment")
        .addToBackStack("SubFragment")
                .commit();
        contentFragment.changeData(var,array);
    }

    public void startSubFragment(String[] var){
        SubFragment subFragment = new SubFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, subFragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
        subFragment.changeData(var);
    }

    public void startJavaFragment(String var){
        JavaFragment javaFragment = new JavaFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, javaFragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
    }

    public void startAndroidFragment(){
        AndroidFragment androidFragment = new AndroidFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, androidFragment, "AndroidFragment")
                .addToBackStack("AndroidFragment").commit();
    }

    public void startFeedbackFragment(String var){
        FeedbackFragment feedbackFragment = new FeedbackFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, feedbackFragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
    }

    public void startDbLoadFragment(String var){
        DbLoadFragment feedbackFragment = new DbLoadFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, feedbackFragment, "DbLoadFragment")
                .addToBackStack("DbLoadFragment").commit();
    }

    public void startAlgorithmFragment(String var){
        AlgorithmFragment leetCodeFragment = new AlgorithmFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, leetCodeFragment, "AlgorithmFragment")
                .addToBackStack("AlgorithmFragment").commit();
    }

    public void startDbFragment(){
        DbFragment dbFragment = new DbFragment();
        getFragmentManager().beginTransaction()
                .replace(R.id.container, dbFragment, "DbFragment")
                .addToBackStack( "DbFragment")
                .commit();
    }
    public void startAboutFragment(){
        AboutFragment aboutFragment = new AboutFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, aboutFragment, "AboutFragment")
                .addToBackStack("AboutFragment").commit();
    }

    public AppStart checkAppStart() {
        PackageInfo pInfo;
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        AppStart appStart = AppStart.NORMAL;
        try {
            pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            int lastVersionCode = sharedPreferences
                    .getInt(LAST_APP_VERSION, -1);
            int currentVersionCode = pInfo.versionCode;
            appStart = checkAppStart(currentVersionCode, lastVersionCode);
            // Update version in preferences
            sharedPreferences.edit()
                    .putInt(LAST_APP_VERSION, currentVersionCode).commit();
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("Check Start",
                    "Unable to determine current app version from pacakge manager. Defenisvely assuming normal app start.");
        }
        return appStart;
    }

    public AppStart checkAppStart(int currentVersionCode, int lastVersionCode) {
        if (lastVersionCode == -1) {
            return AppStart.FIRST_TIME;
        } else if (lastVersionCode < currentVersionCode) {
            return AppStart.FIRST_TIME_VERSION;
        } else if (lastVersionCode > currentVersionCode) {
            Log.d("Check Start", "Current version code (" + currentVersionCode
                    + ") is less then the one recognized on last startup ("
                    + lastVersionCode
                    + "). Defenisvely assuming normal app start.");
            return AppStart.NORMAL;
        } else {
            return AppStart.NORMAL;
        }
    }

    public void updateGallery(int actionsToBePerformedOnScreen) {
        Message msg = new Message();
        msg.what = actionsToBePerformedOnScreen;
        galleryListHandler.sendMessage(msg);
    }

    public Handler galleryListHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    showDialog(0);
                    break;
                case 1:
                    // clear all images in the list
                    removeDialog(0);
                    break;
            }
        }
    };
}