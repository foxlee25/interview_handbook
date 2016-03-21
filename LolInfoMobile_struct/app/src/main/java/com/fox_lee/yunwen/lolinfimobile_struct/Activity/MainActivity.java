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
import android.util.Log;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmSubFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.CodeMenuFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.ContentFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.DbFragment;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

//    ActionBarDrawerToggle mDrawerToggle;
    boolean doubleBackToExitPressedOnce = false;

    public void startContentFragment(String var){
        ContentFragment contentFragment = new ContentFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, contentFragment, "AlgorithmSubFragment")
                .addToBackStack("AlgorithmSubFragment").commit();
        contentFragment.changeData(var);
    }

    public void startAlgorithmSubFragment(String[] var){
        AlgorithmSubFragment algorithmSubFragment = new AlgorithmSubFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, algorithmSubFragment, "AlgorithmSubFragment")
                .addToBackStack("AlgorithmSubFragment").commit();
        algorithmSubFragment.changeData(var);
    }

    public void startAlgorithmFragment(String var){
        AlgorithmFragment leetCodeFragment = new AlgorithmFragment();
        getFragmentManager().beginTransaction().replace(R.id.container, leetCodeFragment, "AlgorithmFragment")
                .addToBackStack("AlgorithmFragment").commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.menu_icon);

//        DrawerLayout mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer_layout, toolbar, R.string.openDrawer, R.string.closeDrawer) {
//            @Override
//            public void onDrawerOpened(View drawerView) {
//                super.onDrawerOpened(drawerView);
//            }
//
//            @Override
//            public void onDrawerClosed(View drawerView) {
//                super.onDrawerClosed(drawerView);
//            }
//        };
//        mDrawer_layout.setDrawerListener(mDrawerToggle);
//        mDrawerToggle.syncState();

//        ImageView img1 = (ImageView) findViewById(R.id.rowIconCoding);
//        ImageView img2 = (ImageView) findViewById(R.id.rowIcon1);
//        ImageView img3 = (ImageView) findViewById(R.id.rowIconFavorite);
//        ImageView img4 = (ImageView) findViewById(R.id.rowIcon3);
//        img1.setOnClickListener(this);
//        img2.setOnClickListener(this);
//        img3.setOnClickListener(this);
//        img4.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Coming Soon", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        toolbar.getMenu().clear();
        AlgorithmFragment algorithmFragment = new AlgorithmFragment();
        this.getFragmentManager().beginTransaction()
                .replace(R.id.container, algorithmFragment, "Fragment")
                .addToBackStack(null)
                .commit();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rowIconCoding: /** Start a new fragment */
                Snackbar.make(v, "Open coding interview ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                clearBackStack();
                AlgorithmFragment algorithmFragment = new AlgorithmFragment();
                this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, algorithmFragment, "Fragment")
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.rowIcon1: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Coming Soon", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.rowIconFavorite: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Open Favorite List", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                DbFragment dbFragment = new DbFragment();
                this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, dbFragment, "Fragment")
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.rowIcon3: /** AlerDialog when click on 4th icon */
                Snackbar.make(v, "Coming Soon", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
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
            Intent startActivity = new Intent(this, AboutActivity.class);
            startActivity(startActivity);
            return true;
        }
//        if (id == R.id.action_settings) {
//            // to do
//            Toast.makeText(this,"Coming Sonn",Toast.LENGTH_SHORT).show();
//            return true;
//        }
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
            MainActivity.this.finish();
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
}
