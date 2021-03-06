package com.edwinabrenda.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = MediaPlayer.create(this,R.raw.sound);
    }

    public void onPlay(View view) {
        music.start();
    }


    public void onStop(View view) {
        music.stop();
        music = MediaPlayer.create(this,R.raw.sound);
    }


    public void onPause(View view) {
        music.pause();
    }
}