package com.fox_lee.yunwen.lolinfimobile_struct.Activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AboutFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AndroidFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.ContentFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbLoadFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.FeedbackFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.JavaFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.SubFragment;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ActionBarDrawerToggle mDrawerToggle;
    boolean doubleBackToExitPressedOnce = false;
    LinearLayout ll1;
    LinearLayout ll2;
    RelativeLayout lla;
    LinearLayout ll3;
    LinearLayout ll4;
    LinearLayout ll5;
    LinearLayout ll6;
    LinearLayout ll7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menu_icon);
        DrawerLayout mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer_layout, toolbar, R.string.openDrawer, R.string.closeDrawer) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawer_layout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        createView();//create icon in the slide menu
        setListener();//set onclick listener in the slide menu
        changeColor();
        toolbar.getMenu().clear();
        this.startAlgorithmFragment("");
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
    }

    private void setListener(){
        ll1.setOnClickListener(this);
        ll2.setOnClickListener(this);
        lla.setOnClickListener(this);
        ll3.setOnClickListener(this);
        ll4.setOnClickListener(this);
        ll5.setOnClickListener(this);
        ll6.setOnClickListener(this);
    }

    private void changeColor(){
        ll1.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll2.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        lla.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll3.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll5.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll6.setBackgroundColor(getResources().getColor(R.color.colorGreen));
        ll7.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rowIconAlgorithm: /** Start a new fragment */
                Snackbar.make(v, "Open DbFavorite coding", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                clearBackStack();
                this.startAlgorithmFragment("");
                break;
            case R.id.rowIconJava: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Open Core Java Question", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startJavaFragment("");
                break;
            case R.id.rowIconAndroid: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Open Core Android Question", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startAndroidFragment();
                break;
            case R.id.rowIconFavorite: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open Favorite List", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startDbFragment();
                break;
            case R.id.rowIconAbout: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open About", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startAboutFragment();
                break;
            case R.id.rowIcon5: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open Feedback", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                this.startFeedbackFragment("");
                break;
//            case R.id.rowIcon6: /** AlerDialog when click on 3rd icon */
//                Snackbar.make(v, "Open Alarm", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//                this.startDbLoadFragment("");
//                break;
            default:
                Snackbar.make(v, "Coming Soon", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
        }
        DrawerLayout mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawer_layout.closeDrawer(Gravity.LEFT);
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
        if (id == R.id.db_algorithm) {
            // START THE about activity
            startDbLoadFragment("");
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

    private void clearBackStack() {
        FragmentManager manager = getFragmentManager();
        if (manager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
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
    public void startContentFragment(String var){
        ContentFragment contentFragment = new ContentFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, contentFragment, "SubFragment")
                .addToBackStack("SubFragment").commit();
        contentFragment.changeData(var);
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
}