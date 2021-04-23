package com.news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class VideView extends AppCompatActivity {
    VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vide_view);

        ArrayList<String> play = new ArrayList<String>();
        play.add("android.resource://"+getPackageName()+"/"+R.raw.vone);
        play.add("android.resource://"+getPackageName()+"/"+R.raw.vtwo);

        
//        video = findViewById(R.id.video);
//        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vone);
//        MediaController controller = new MediaController(this);
//        controller.setAnchorView(video);
//        video.setMediaController(controller);
//        MediaPlayer
    }
}

