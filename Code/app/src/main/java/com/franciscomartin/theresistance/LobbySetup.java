package com.franciscomartin.theresistance;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LobbySetup extends AppCompatActivity {

    public static final String LOBBY_NAME = "lobbyName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_setup);

        final Typeface font
                = Typeface.createFromAsset(getAssets(), "fonts/ethnocentric.ttf");
        TextView textView;
        //The Resistance
        textView = (TextView) findViewById(R.id.create_lobby);
        textView.setTypeface(font);
    }

    public void onCreateLobbyClick(View view) {
        Intent createLobbyIntent = new Intent(LobbySetup.this, PlayerSetup.class);

        EditText lobbyNameField = (EditText) findViewById(R.id.lobby_name_field);
        createLobbyIntent.putExtra(LOBBY_NAME, lobbyNameField.getText().toString());

        startActivity(createLobbyIntent);
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_lobby_settings, menu);
//        return true;
//    }
//
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
