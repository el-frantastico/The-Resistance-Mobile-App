package com.franciscomartin.theresistance;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MultiPlayerSetup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player_setup);

        final Typeface font
                = Typeface.createFromAsset(getAssets(), "fonts/ethnocentric.ttf");
        //Create Lobby
        final TextView createLobbyTextView = (TextView) findViewById(R.id.create_lobby);
        createLobbyTextView.setTypeface(font);
        //Join Lobby
        TextView joinLobbyTextView = (TextView) findViewById(R.id.join_lobby);
        joinLobbyTextView.setTypeface(font);
        joinLobbyTextView.setTextColor(Color.argb(75, 255, 255, 255));
    }

    public void onCreateLobbyClick(View view) {
        Intent createLobbyIntent = new Intent(this, LobbySetup.class);
        startActivity(createLobbyIntent);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_multi_player_setup, menu);
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
}
