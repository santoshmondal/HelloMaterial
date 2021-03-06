package com.affixus.andy.hellonov14;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private DrawerLayout drawer_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer_final);

        toolbar = (Toolbar) findViewById(R.id.appbar_id);
        setSupportActionBar(toolbar);

        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        My_Drawer_Fragment drawer_fragment = (My_Drawer_Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        drawer_fragment.setup(drawer_layout, toolbar);

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

        if(id == R.id.navigate) {
            startActivity(new Intent(this, NextActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
