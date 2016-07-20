package com.example.banglaborno;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View.OnClickListener;

public class BenjornobornoActivity extends Activity implements OnClickListener {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
	Button nextButton;
	MediaPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_benjornoborno);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);
		b10 = (Button) findViewById(R.id.button10);
		b11 = (Button) findViewById(R.id.button11);
		b12 = (Button) findViewById(R.id.button12);
		b13 = (Button) findViewById(R.id.button13);
		nextButton = (Button) findViewById(R.id.next1);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
		b7.setOnClickListener(this);
		b8.setOnClickListener(this);
		b9.setOnClickListener(this);
		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		nextButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		if (view == b1) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.ba);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b2) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bb);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b3) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bc);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b4) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bd);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b5) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.be);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b6) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bf);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b7) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bg);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b8) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bh);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b9) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bi);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b10) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bj);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b11) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bk);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b12) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bl);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b13) {
			mPlayer = MediaPlayer.create(BenjornobornoActivity.this, R.raw.bm);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else {
			Intent intent1 = new Intent(BenjornobornoActivity.this,
					BenjonbornoActivity1.class);
			startActivity(intent1);
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
