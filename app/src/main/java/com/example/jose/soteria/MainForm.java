package com.example.jose.soteria;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.text.Editable;


public class MainForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);
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
        });*/

        // Importing Edit Text for edittext classes
        final EditText FirstName = (EditText) findViewById(R.id.firstname);
        final EditText LastName = (EditText) findViewById(R.id.lastname);
        final EditText Address = (EditText) findViewById(R.id.address);
        final EditText PhoneNumber = (EditText) findViewById(R.id.phone);
        final EditText EmailAddress = (EditText) findViewById(R.id.email);
        // importing button
        Button B = (Button) findViewById(R.id.confirm);
        //on button clicked
        B.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                Intent goto_next_activity = new Intent(getApplicationContext(), UserProfile.class);
                // setting to String
                String fname = FirstName.getText().toString();
                String lname = LastName.getText().toString();
                String uaddress = Address.getText().toString();
                String uphonenumber = PhoneNumber.getText().toString();
                String uemailaddress = EmailAddress.getText().toString();

                //passing variables via intent
                Bundle b = new Bundle();
                b.putString("UserFirst", fname);
                b.putString("UserLast", lname);
                b.putString("UserAddress", uaddress);
                b.putString("UserPhone", uphonenumber);
                b.putString("UserEmail", uemailaddress);

                //Passing values through intent
                goto_next_activity.putExtras(b);
                startActivity(goto_next_activity);


            }


        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
