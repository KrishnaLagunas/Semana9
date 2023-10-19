package com.example.semana9;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView mivideo = findViewById(R.id.viVision);

        String videop="android.resource://" + getOpPackageName() + R.raw.video;
        Uri uri = Uri.parse(videop);
        mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);
    }
}