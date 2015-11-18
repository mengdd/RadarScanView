package com.guo.duoduo.radarscanview;


import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.guo.duoduo.randomtextview.RandomTextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RandomTextView randomTextView = (RandomTextView) findViewById(
                R.id.random_textview);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                randomTextView.addKeyWord("A");
                randomTextView.addKeyWord("B");
                randomTextView.show();
            }
        }, 2 * 1000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
