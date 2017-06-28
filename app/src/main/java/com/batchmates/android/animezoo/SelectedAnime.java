package com.batchmates.android.animezoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class SelectedAnime extends AppCompatActivity {

    private static final String PASSED = "PASS_THIS";
    private String currentAnime;
    private TextView name,genre,disc;
    private ImageView pic;
    private int music;
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_anime);

        name=(TextView)findViewById(R.id.tvname);
        genre=(TextView)findViewById(R.id.tvGenreThis);
        disc=(TextView)findViewById(R.id.tvdiscription);
        pic=(ImageView)findViewById(R.id.ivPicture);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);

        Intent intent=getIntent();

        currentAnime=intent.getStringExtra(PASSED);

        Log.d("YAY", "onCreate: "+currentAnime);

        SQLightHandler sql=new SQLightHandler(this);
        sql.getWritableDatabase();


        Anime anime=sql.getAnime(currentAnime);

        name.setText(anime.getAnimeName());
        genre.setText(anime.getAnimeGenre());
        disc.setText(anime.getAnimeDiscription());
        pic.setBackgroundResource(anime.getAnimePicture());
        music=anime.getSound();


        media=new MediaPlayer();





    }

    public void playSound(View view) throws IOException {

        Log.d("This Song", "playSound: "+music);
        //MediaPlayer media = MediaPlayer.create(this,R.raw.beep1);

        media = MediaPlayer.create(this, music);
        media.setVolume(0, 1);
        media.start();

        
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            if(media.isPlaying())
            {
                media.stop();
                media.release();
            }
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
