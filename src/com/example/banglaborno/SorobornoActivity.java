package com.example.banglaborno;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SorobornoActivity extends Activity implements OnClickListener{

	Button sor1,sor2,sor3,sor4,sor5,sor6,sor7,sor8,sor9,sor10,sor11;
    MediaPlayer mPlayer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_soroborno);
		sor1=(Button) findViewById(R.id.sor1);
		sor2=(Button) findViewById(R.id.sor2);
		sor3=(Button) findViewById(R.id.sor3);
		sor4=(Button) findViewById(R.id.sor4);
		sor5=(Button) findViewById(R.id.sor5);
		sor6=(Button) findViewById(R.id.sor6);
		sor7=(Button) findViewById(R.id.sor7);
		sor8=(Button) findViewById(R.id.sor8);
		sor9=(Button) findViewById(R.id.sor9);
		sor10=(Button) findViewById(R.id.sor10);
		sor11=(Button) findViewById(R.id.sor11);
		sor1.setOnClickListener(this);
		sor2.setOnClickListener(this);
		sor3.setOnClickListener(this);
		sor4.setOnClickListener(this);
		sor5.setOnClickListener(this);
		sor6.setOnClickListener(this);
		sor7.setOnClickListener(this);
		sor8.setOnClickListener(this);
		sor9.setOnClickListener(this);
		sor10.setOnClickListener(this);
		sor11.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		if(view==sor1)
		{
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.a);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
			
		}
		else if (view==sor2) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.b);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
			
		}
		else if (view==sor3) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.c);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor4) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.d);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor5) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.e);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor6) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.f);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor7) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.g);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor8) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.h);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor9) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.i);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else if (view==sor10) {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.j);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
		else {
			mPlayer=MediaPlayer.create(SorobornoActivity.this, R.raw.k);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		}
	}
	
	
	
	protected void releaseMediaPlayerResource(final MediaPlayer mPlayer2) {
		// TODO Auto-generated method stub
		mPlayer2.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer arg0) {
				// TODO Auto-generated method stub
				mPlayer2.release();
			}
		});
	}

}
