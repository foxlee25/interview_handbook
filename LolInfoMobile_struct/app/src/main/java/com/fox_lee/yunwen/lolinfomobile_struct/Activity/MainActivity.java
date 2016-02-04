package com.fox_lee.yunwen.lolinfomobile_struct.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import android.widget.Toast;

import com.fox_lee.yunwen.lolinfomobile_struct.Fragment.LolStaggeredFragment;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menu_icon);

        DrawerLayout mDrawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer_layout,toolbar, R.string.openDrawer, R.string.closeDrawer) {
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
    }


    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rowIcon0: /** Start a new Activity MyCards.java */
                Snackbar.make(v, "Click slide photo 1 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                LolStaggeredFragment staggeredFragment = new LolStaggeredFragment();
                Log.d("Fragment", "The Lol staggered wallpaper layout is on:");
                this.getFragmentManager().beginTransaction()
                        .replace(R.id.container, staggeredFragment, "Fragment")
                        .addToBackStack(null)
                        .commit();
                break;

            case R.id.rowIcon1: /** AlerDialog when click on Exit */
                Snackbar.make(v, "Click slide photo 2 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.rowIcon2: /** AlerDialog when click on Exit */
                Snackbar.make(v, "Click slide photo 3 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;

            case R.id.rowIcon3: /** AlerDialog when click on Exit */
                Snackbar.make(v, "Click slide photo 4 succeed.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
        }
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
}
