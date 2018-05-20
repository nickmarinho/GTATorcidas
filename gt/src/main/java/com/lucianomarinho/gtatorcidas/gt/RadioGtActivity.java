package com.lucianomarinho.gtatorcidas.gt;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import java.io.IOException;
import com.google.android.gms.ads.*;

public class RadioGtActivity extends ActionBarActivity implements View.OnClickListener {
    private ProgressBar playSeekBar;
    private Button buttonPlay;
    private Button buttonStopPlay;
    private MediaPlayer player;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiogt_main);
        initializeUIElements();
        initializeMediaPlayer();

        getSupportActionBar().setTitle("Rádio GT");

        Button btn = (Button) findViewById(R.id.button_ok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RadioGtActivity.this, MainActivity.class));
            }
        });

        // Consultar o AdView como um recurso e carregar uma solicitação.
        AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (player.isPlaying()) {
            player.stop();
        }
    }

    private void initializeUIElements() {
        playSeekBar = (ProgressBar) findViewById(R.id.progress_bar);
        playSeekBar.setMax(100);
        playSeekBar.setVisibility(View.INVISIBLE);
        buttonPlay = (Button) findViewById(R.id.button_play);
        buttonPlay.setOnClickListener(this);
        buttonStopPlay = (Button) findViewById(R.id.button_stop);
        buttonStopPlay.setEnabled(false);
        buttonStopPlay.setOnClickListener(this);
    }

    private void initializeMediaPlayer() {
        player = new MediaPlayer();
        try {
            String url = "http://107.150.55.178:7488"; // Radio GT
            player.setDataSource(url);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        player.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
            public void onBufferingUpdate(MediaPlayer mp, int percent) {
                playSeekBar.setSecondaryProgress(percent);
                Log.i("Buffering", "" + percent);
            }
        });
    }

    public void onClick(View v) {
        if (v == buttonPlay) {
            startPlaying();
        } else if (v == buttonStopPlay) {
            stopPlaying();
        }
    }

    private void startPlaying() {
        buttonStopPlay.setEnabled(true);
        buttonPlay.setEnabled(false);
        playSeekBar.setVisibility(View.VISIBLE);
        player.prepareAsync();
        player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mp) {
                player.start();
            }
        });
    }

    private void stopPlaying() {
        if (player.isPlaying()) {
            player.stop();
            player.release();
            initializeMediaPlayer();
        }

        buttonPlay.setEnabled(true);
        buttonStopPlay.setEnabled(false);
        playSeekBar.setVisibility(View.INVISIBLE);
    }
}