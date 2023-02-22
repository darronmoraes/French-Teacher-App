package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayTheColor(View view) {

        Button btnClicked = (Button) view;

        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                getResources().getIdentifier(
                        btnClicked.getTag().toString(),  // Save the tag and audio name same
                        "raw",
                        getPackageName()
                )
        );
        mediaPlayer.start();
    }
}