package com.example.vsykes.santashelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    static boolean gender = true;
    static boolean sport = true;
    static boolean music = true;
    static boolean electronics = true;
    static boolean art = true;
    static boolean cooking = true;
    static boolean makeup = true;
    static boolean shopping = true;
    static boolean gardening = true;
    static boolean videoGames = true;
    public static String userAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button male = (Button)findViewById(R.id.MaleBtn);
        final Button female = (Button)findViewById(R.id.FemaleBtn);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender = true;
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender = false;
            }
        });


        CheckBox sports = (CheckBox)findViewById(R.id.checkSports);
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sport = false;
            }
        });

        CheckBox musicBox = (CheckBox)findViewById(R.id.checkMusic);
        musicBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music = false;
            }
        });

        CheckBox electronicsBox = (CheckBox)findViewById(R.id.checkElectronics);
        electronicsBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                electronics = false;
            }
        });


        CheckBox artBox = (CheckBox)findViewById(R.id.checkArt);
        artBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                art = false;
            }
        });

        CheckBox cookingBox = (CheckBox)findViewById(R.id.checkCooking);
        cookingBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cooking = false;
            }
        });

        CheckBox makeupBox = (CheckBox)findViewById(R.id.checkMakeup);
        makeupBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeup = false;
            }
        });

        CheckBox shoppingBox = (CheckBox)findViewById(R.id.checkShopping);
        shoppingBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shopping = false;
            }
        });

        CheckBox gardeningBox = (CheckBox)findViewById(R.id.checkGardening);
        gardeningBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gardening = false;
            }
        });

        CheckBox videoGamesBox = (CheckBox)findViewById(R.id.checkVideoGames);
        videoGamesBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoGames = false;
            }
        });


        final Button submit = (Button)findViewById(R.id.ResultBtn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setText();
                startActivity(new Intent(ScrollingActivity.this, Results.class));
            }
        });
    }
    public void setText() {
        EditText age = (EditText) findViewById(R.id.ageInput);
        userAge=age.getText().toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
        System.out.println("Hi");

        return super.onOptionsItemSelected(item);
    }
}
//package com.example.vsykes.santashelper;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Button;
//
//import java.util.Scanner;
//
//public class ScrollingActivity extends AppCompatActivity {
//
//    String gender;
//
//    public class Person {
//
//        boolean gender;
//        String name;
//        int age;
//        int priceLow;
//        int priceHigh;
//
//    }
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_scrolling);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//        Button MaleBtn = (Button) findViewById(R.id.MaleBtn);
//        MaleBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gender = "Male";
//            }
//        });
//        Button FemaleBtn = (Button) findViewById(R.id.FemaleBtn);
//        FemaleBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                gender = "Female";
//            }
//        });
//
//        Button ResultBtn = (Button) findViewById(R.id.ResultBtn);
//        ResultBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openResults();
//
//            }
//        });
//
//    }
//    public void openResults() {
//        Intent intent = new Intent(this, Results.class);
//        startActivity(intent);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
//        return super.onOptionsItemSelected(item);
//    }
//}
