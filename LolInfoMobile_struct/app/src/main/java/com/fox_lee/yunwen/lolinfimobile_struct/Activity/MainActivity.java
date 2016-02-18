package com.fox_lee.yunwen.lolinfimobile_struct.Activity;

import android.app.FragmentManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmSubFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.CodeMenuFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.AlgorithmFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.ContentFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Fragment.LolRecyclerViewFragment;
import com.fox_lee.yunwen.lolinfimobile_struct.Model.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Model.HashMapContent;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.DBHelper;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ActionBarDrawerToggle mDrawerToggle;
    //private DBHelper dbHelper;

    public void startContentFragment(String var){
        ContentFragment contentFragment = new ContentFragment();
        Log.d("Fragment", "Content is: " + var);
        getFragmentManager().beginTransaction().replace(R.id.container, contentFragment, "AlgorithmSubFragment")
                .addToBackStack("AlgorithmSubFragment").commit();
        contentFragment.changeData(var);
    }

    public void startAlgorithmSubFragment(String[] var){
        AlgorithmSubFragment algorithmSubFragment = new AlgorithmSubFragment();
        Log.d("Fragment", "Content is: " + var);
        getFragmentManager().beginTransaction().replace(R.id.container, algorithmSubFragment, "AlgorithmSubFragment")
                .addToBackStack("AlgorithmSubFragment").commit();
        algorithmSubFragment.changeData(var);
    }

    public void startAlgorithmFragment(String var){
        AlgorithmFragment leetCodeFragment = new AlgorithmFragment();
        Log.d("Fragment", "Content is: " + var);
        getFragmentManager().beginTransaction().replace(R.id.container, leetCodeFragment, "AlgorithmFragment")
                .addToBackStack("AlgorithmFragment").commit();
    }

    public void startJavaFragment(String var){
        AlgorithmFragment leetCodeFragment = new AlgorithmFragment();
        Log.d("Fragment", "The Language is: " + var);
        getFragmentManager().beginTransaction().replace(R.id.container, leetCodeFragment, "CodeFragment")
                .addToBackStack("CodeFragment").commit();
    }

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
                Toast.makeText(getApplicationContext(), "Drawer is opened", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Toast.makeText(getApplicationContext(), "Drawer is closed", Toast.LENGTH_SHORT).show();
            }
        };

        mDrawer_layout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();

        ImageView img1 = (ImageView) findViewById(R.id.rowIcon0);
        ImageView img2 = (ImageView) findViewById(R.id.rowIcon1);
        ImageView img3 = (ImageView) findViewById(R.id.rowIcon2);
        ImageView img4 = (ImageView) findViewById(R.id.rowIcon3);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        toolbar.getMenu().clear();

        //create database
        HashMapContent hashMapContent = new HashMapContent();
        HashMap hm = hashMapContent.getAir();
        String[] sth = getResources().getStringArray(R.array.basics);
        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase db=dbHelper.getReadableDatabase();

        AlgorithmRepo repo = new AlgorithmRepo(this);
        Algorithm algorithm = new Algorithm();
        for (int cnt = 0; cnt < sth.length; cnt++){
            algorithm.age = 0;
            algorithm.topic = sth[cnt];
            algorithm.content = hm.get(sth[cnt]).toString();
            algorithm.algorithm_ID = 0;
            // int algorithm_Id = repo.insert(algorithm);
            //insert a column

            Log.d("MainActivity", "The " + " Topic is: " + algorithm.topic);
            Log.d("MainActivity", "The content is: " + algorithm.content);
            repo.insert(algorithm);
        }


//        String selectQuery="SELECT "+
//                algorithm.KEY_ID+","+
//                algorithm.KEY_content+","+
//                algorithm.KEY_topic+","+
//                algorithm.KEY_age+" FROM "+algorithm.TABLE;
//
//        Cursor c = db.rawQuery(selectQuery,null);

//        int id[] = new int[c.getCount()];
//        int i = 0;
//        if (c.getCount() > 0)
//        {
//            c.moveToFirst();
//            do {
//                id[i] = c.getInt(c.getColumnIndex(algorithm.topic));
//                i++;
//                Log.d("MainActivity", "The " + i + " Topic is: " + c.getString(c.getColumnIndex(algorithm.topic)));
//                Log.d("MainActivity", "The content is: " + c.getString(c.getColumnIndex(algorithm.content)));
//            } while (c.moveToNext());
//            c.close();
//        }
//
//        db.close();
//        repo.delete(1);
//        repo.delete(2);
//        repo.delete(3);
        //select value and display


        ArrayList<HashMap<String, String>> studentList =  repo.getAlgorithmList();


        Log.d("","");
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rowIcon0: /** Start a new fragment */
                Snackbar.make(v, "Click slide photo 1 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                CodeMenuFragment codeMenuFragment = new CodeMenuFragment();
                Log.d("Fragment", "The CodeMenu layout is on:");
                this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, codeMenuFragment, "Fragment")
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.rowIcon1: /** Start a new fragment LolRecyclerViewFragment.java */
                Snackbar.make(v, "Click slide photo 2 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                LolRecyclerViewFragment recyclerViewFragment = new LolRecyclerViewFragment();
                Log.d("Fragment", "The Lol RecyclerView layout is on:");
                this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, recyclerViewFragment, "Fragment")
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.rowIcon2: /** AlerDialog when click on 3rd icon */
                Snackbar.make(v, "Click slide photo 3 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.rowIcon3: /** AlerDialog when click on 4th icon */
                Snackbar.make(v, "Click slide photo 4 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
        }
        DrawerLayout mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawer_layout.closeDrawer(Gravity.LEFT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        @Override
    public void onBackPressed(){
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            Log.i("MainActivity", "popping backstack");
            fm.popBackStack();
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }
}
