package com.kjscefriends.arunimasgift;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView header;
    public Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,kill;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.activity_main2);

        Button a = (Button) findViewById(R.id.a);
        Button b = (Button) findViewById(R.id.b);
        Button c = (Button) findViewById(R.id.c);
        Button d = (Button) findViewById(R.id.d);
        Button e = (Button) findViewById(R.id.e);
        Button f = (Button) findViewById(R.id.f);
        Button g = (Button) findViewById(R.id.g);
        Button h = (Button) findViewById(R.id.h);
        Button i = (Button) findViewById(R.id.i);
        Button j = (Button) findViewById(R.id.j);
        Button k = (Button) findViewById(R.id.k);
        Button l = (Button) findViewById(R.id.l);
        Button m = (Button) findViewById(R.id.m);
        Button n = (Button) findViewById(R.id.n);
        Button o = (Button) findViewById(R.id.o);
        Button p = (Button) findViewById(R.id.p);
        Button kill = (Button) findViewById(R.id.kill);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        kill.setOnClickListener(this);
    }

    private void playsong(int path ) {
        if (mediaPlayer!=null && mediaPlayer.isPlaying())
            mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, path);
        mediaPlayer.start();
    }

    private void killaudio() {
        if (mediaPlayer!=null && mediaPlayer.isPlaying())
            mediaPlayer.stop();
    }

        @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.a:
                playsong(R.raw.ajay);
                break;
            case R.id.b:
                playsong(R.raw.apk);
                break;
            case R.id.c:
                playsong(R.raw.farheen);
                break;
            case R.id.d:
                playsong(R.raw.forum);
                break;
            case R.id.e:
                playsong(R.raw.neeraj);
                break;
            case R.id.f:
                playsong(R.raw.purvak);
                break;
            case R.id.g:
                playsong(R.raw.sahil);
                break;
            case R.id.h:
                playsong(R.raw.saloni);
                break;
            case R.id.i:
                playsong(R.raw.sam);
                break;
            case R.id.j:
                playsong(R.raw.sejal);
                break;
            case R.id.k:
                playsong(R.raw.shalaka);
                break;
            case R.id.l:
                playsong(R.raw.sheetal);
                break;
            case R.id.m:
                playsong(R.raw.simi);
                break;
            case R.id.n:
                playsong(R.raw.umang);
                break;
            case R.id.o:
                playsong(R.raw.viren);
                break;
            case R.id.p:
                //Pranali's audio here
                break;
            case R.id.kill:
                //Pranali's audio here
                killaudio();
                break;

        }
    }
}
