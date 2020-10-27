package com.gabriel.spotfy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView msc;
    Button btnPlay;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msc = (ImageView) findViewById(R.id.msc);
        Glide.with(this).load("https://img.youtube.com/vi/tc-bxi26GSA/0.jpg").into(msc);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tlrc);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }
}