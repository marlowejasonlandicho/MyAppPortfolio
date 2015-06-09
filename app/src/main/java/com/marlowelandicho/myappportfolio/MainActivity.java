package com.marlowelandicho.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void openApp(View view) {
        showToast(view.getId());
    }

    private void showToast(int id) {
        Context context = getApplicationContext();
        String appTitle = null;
        switch (id) {
            case R.id.spotify_streamer:
                appTitle = "Spotify Streamer";
                break;
            case R.id.super_duo_app:
                appTitle = "Super Duo App";
                break;
            case R.id.library_app:
                appTitle = "Library App";
                break;
            case R.id.build_it_bigger:
                appTitle = "Build It Bigger App";
                break;
            case R.id.xyz_reader:
                appTitle = "XYZ Reader App";
                break;
            case R.id.my_own_app:
                appTitle = "Capstone App";
                break;
        }
        CharSequence text = "This button will launch " + appTitle;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
