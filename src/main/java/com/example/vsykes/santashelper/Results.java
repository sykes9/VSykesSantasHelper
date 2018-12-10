package com.example.vsykes.santashelper;

//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.widget.TextView;
//
//public class Results extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_results);
//
//        TextView gender = findViewById(R.id.displayGender);
//        gender.setText("the gender is: " + gender);
//
//        TextView sport = findViewById(R.id.displaySport);
//        sport.setText("you are interested in " + sport);
//
//        TextView age = findViewById(R.id.displayAge);
//        age.setText("you are " + ScrollingActivity.userAge + " years old!!!!!1");
//
//    }
//}

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        TextView gender = findViewById(R.id.displayGender);
//        if (ScrollingActivity.gender == true) {
//            gender.setText("the gender is: male");
//        } else {
//            gender.setText("the gender is: female");
//        }
//
//        TextView sportText = findViewById(R.id.displaySport);
//        if (ScrollingActivity.sport == false) {
//            sportText.setText("you are interested in: sports");
//        }
//
//        TextView musicText = findViewById(R.id.displayMusic);
//        if (ScrollingActivity.music == false) {
//            musicText.setText("you are interested in: music");
//        }
//
//        TextView electronicsText = findViewById(R.id.displayElectronics);
//        if (ScrollingActivity.electronics == false) {
//            electronicsText.setText("you are interested in: electronics");
//        }
//
//        TextView artText = findViewById(R.id.displayArt);
//        if (ScrollingActivity.art == false) {
//            artText.setText("you are interested in: art");
//        }
//
//
//        TextView age = findViewById(R.id.displayAge);
//        age.setText("you are " + ScrollingActivity.userAge + " years old!!!!!");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}
