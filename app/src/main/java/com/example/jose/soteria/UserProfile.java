package com.example.jose.soteria;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }*/

        // Getting Strings from MainForm
        Bundle extras = getIntent().getExtras();
        //Strings for Holding Values Recieved
        String fname = extras.getString("UserFirst");
        String lname = extras.getString("UserLast");
        String uaddress = extras.getString("UserAddress");
        String uphonenumber = extras.getString("UserPhone");
        String uemailaddress = extras.getString("UserEmail");

        //Importing textview

        TextView name = (TextView) findViewById(R.id.one);
        TextView addr = (TextView) findViewById(R.id.two);
        TextView phonenum = (TextView) findViewById(R.id.three);
        TextView email = (TextView) findViewById(R.id.four);

        //Setting the text of the text view as the string _____

        name.setText(fname + lname);
        addr.setText(uaddress);
        phonenum.setText(uphonenumber);
        email.setText(uemailaddress);


    }

        public void dooSomething(View v){
            Button button = (Button) v;
            startActivity(new Intent(getApplicationContext(), Panic.class));
        }
}
