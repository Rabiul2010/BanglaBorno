package com.example.banglaborno;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BenjonBornoActivity2 extends Activity implements OnClickListener {

	Button b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39;
	Button nextButton;
	MediaPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_benjon_borno_activity2);

		b27 = (Button) findViewById(R.id.button27);
		b28 = (Button) findViewById(R.id.button28);
		b29 = (Button) findViewById(R.id.button29);
		b30 = (Button) findViewById(R.id.button30);
		b31 = (Button) findViewById(R.id.button31);
		b32 = (Button) findViewById(R.id.button32);
		b33 = (Button) findViewById(R.id.button33);
		b34 = (Button) findViewById(R.id.button34);
		b35 = (Button) findViewById(R.id.button35);
		b36 = (Button) findViewById(R.id.button36);
		b37 = (Button) findViewById(R.id.button37);
		b38 = (Button) findViewById(R.id.button38);
		b39 = (Button) findViewById(R.id.button39);
		b27.setOnClickListener(this);
		b28.setOnClickListener(this);
		b29.setOnClickListener(this);
		b30.setOnClickListener(this);
		b31.setOnClickListener(this);
		b32.setOnClickListener(this);
		b33.setOnClickListener(this);
		b34.setOnClickListener(this);
		b35.setOnClickListener(this);
		b36.setOnClickListener(this);
		b37.setOnClickListener(this);
		b38.setOnClickListener(this);
		b39.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		if (view == b27) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b27);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b28) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b28);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b29) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b29);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b30) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b30);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b31) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b31);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b32) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b32);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b33) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b33);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b34) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b34);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b35) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b35);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b36) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b36);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b37) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b37);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b38) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b38);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b39) {
			mPlayer = MediaPlayer.create(BenjonBornoActivity2.this, R.raw.b39);
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
