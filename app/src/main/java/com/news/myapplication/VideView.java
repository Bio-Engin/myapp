package com.news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class VideView extends AppCompatActivity {

    ArrayList<String> play = new ArrayList<String>();
    String[] my = {"android.resource://"+getPackageName()+"/"+R.raw.vone, "android.resource://"+getPackageName()+"/"+R.raw.vtwo};

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vide_view);
        for (int i=0; i<my.length; i++) {
            my[i] = String.valueOf(video);
        }


        video = findViewById(R.id.video);
        MediaController controller = new MediaController(this);
        controller.setAnchorView(video);
        video.setMediaController(controller);






//        play.add("android.resource://"+getPackageName()+"/"+R.raw.vone);
//        play.add("android.resource://"+getPackageName()+"/"+R.raw.vtwo);
//        for (int i=0; i<play.size(); i++) {
//
//        }
//        video = findViewById(R.id.video);
//        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vone);
//        play.add(video);

//        ArrayList<String> play = new ArrayList<String>();
//        play.add("android.resource://"+getPackageName()+"/"+R.raw.vone);
//        play.add("android.resource://"+getPackageName()+"/"+R.raw.vtwo);
//
//
//        video = findViewById(R.id.video);
//        video.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.vone);
//        MediaController controller = new MediaController(this);
//        controller.setAnchorView(video);
//        video.setMediaController(controller);
//        MediaPlayer
    }
}

