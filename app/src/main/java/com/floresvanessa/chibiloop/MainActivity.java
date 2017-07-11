package com.floresvanessa.chibiloop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    return true;
                case R.id.navigation_playlists:
                    mTextMessage.setText(R.string.title_playlists);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Call showActionBar method to populate the Toolbar
        showActionBar();

        ImageView addAudioButton = (ImageView) findViewById(R.id.add_audio);
        addAudioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextMessage.setText("Add audio");
            }
        });

        ImageView userAccountButton = (ImageView) findViewById(R.id.user_account);
        userAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextMessage.setText("User Account");
            }
        });

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // Get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String userEmail = intent.getStringExtra(SignUpActivity.USER_EMAIL);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.message);
        textView.setText(userEmail);

        // Write a message to the database
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("message");

        databaseReference.setValue("Second Message!");
    }

    // Setting up the custom ActionBar
    private void showActionBar() {
        LayoutInflater inflator = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflator.inflate(R.layout.ab_custom_layout, null);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowHomeEnabled (false);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setCustomView(v);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
////            case R.id.action_settings:
////                // User chose the "Settings" item, show the app settings UI...
////                return true;
//
//            case R.id.add_audio:
//                mTextMessage.setText("Add audio");
//                return true;
//
//            case R.id.user_account:
//                mTextMessage.setText("User Account");
//                return true;
//
//            default:
//                // If we got here, the user's action was not recognized.
//                // Invoke the superclass to handle it.
//                return super.onOptionsItemSelected(item);
//
//        }
//    }

}
