package com.franciscomartin.theresistance;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);

        //Set Font
        final Typeface font
                = Typeface.createFromAsset(getAssets(), "fonts/ethnocentric.ttf");
        TextView textView;
        //The Resistance
        textView = (TextView) findViewById(R.id.main_title_text_the);
        textView.setTypeface(font);
        textView = (TextView) findViewById(R.id.main_title_text_resistance);
        textView.setTypeface(font);
        //Single Player
        textView = (TextView) findViewById(R.id.main_selection_single);
        textView.setTypeface(font);
        textView.setTextColor(Color.argb(75, 0, 0, 0));
        //Multiplayer
        textView = (TextView) findViewById(R.id.main_selection_multi);
        textView.setTypeface(font);
        //About
        textView = (TextView) findViewById(R.id.main_selection_about);
        textView.setTypeface(font);
        textView.setTextColor(Color.argb(75, 0, 0, 0));
        //Credit
        textView = (TextView) findViewById(R.id.main_credit);
        textView.setTypeface(font);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
    public void onMultiplayerClick(View view) {
        Intent multiPlayerIntent = new Intent(this, MultiPlayerSetup.class);
        startActivity(multiPlayerIntent);
    }
}
