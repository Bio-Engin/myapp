package com.news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class VideView extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vide_view);
        video = findViewById(R.id.video);
//        video.setVideoPath("file:///android_res/raw/vone.mp4");
        video.setVideoPath("https://www.aparat.com/v/HavnF");
        video.start();
    }
}

