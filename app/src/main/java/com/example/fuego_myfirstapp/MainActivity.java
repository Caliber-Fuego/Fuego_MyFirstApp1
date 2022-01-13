//test
//test
package com.example.fuego_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button2;

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = new MediaPlayer();
        player = MediaPlayer.create(this,R.raw.ensolarado);

        Button one = (Button) this.findViewById(R.id.button2);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ain_soph_aur);
        one.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });




        player.start();


        }




    @Override
    public void onPause() {
        super.onPause();

        if (player.isPlaying()) {
            player.pause();

        }
    }
    @Override
    public void onResume() {
        super.onResume();

        player.start();

    }
}
