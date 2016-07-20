package com.example.banglaborno;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BenjonbornoActivity1 extends Activity implements OnClickListener{

	Button b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26;
	Button nextButton;
	MediaPlayer mPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_benjonborno_activity1);

		b14 = (Button) findViewById(R.id.button14);
		b15 = (Button) findViewById(R.id.button15);
		b16 = (Button) findViewById(R.id.button16);
		b17 = (Button) findViewById(R.id.button17);
		b18 = (Button) findViewById(R.id.button18);
		b19 = (Button) findViewById(R.id.button19);
		b20 = (Button) findViewById(R.id.button20);
		b21 = (Button) findViewById(R.id.button21);
		b22 = (Button) findViewById(R.id.button22);
		b23 = (Button) findViewById(R.id.button23);
		b24 = (Button) findViewById(R.id.button24);
		b25 = (Button) findViewById(R.id.button25);
		b26 = (Button) findViewById(R.id.button26);
		nextButton = (Button) findViewById(R.id.next2);
		b14.setOnClickListener(this);
		b15.setOnClickListener(this);
		b16.setOnClickListener(this);
		b17.setOnClickListener(this);
		b18.setOnClickListener(this);
		b19.setOnClickListener(this);
		b20.setOnClickListener(this);
		b21.setOnClickListener(this);
		b22.setOnClickListener(this);
		b23.setOnClickListener(this);
		b24.setOnClickListener(this);
		b25.setOnClickListener(this);
		b26.setOnClickListener(this);
		nextButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		if (view == b14) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.bn);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b15) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.bo);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b16) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.bp);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b17) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.bq);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b18) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b18);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b19) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b19);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b20) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b20);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b21) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b21);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b22) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b22);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b23) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b23);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b24) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b24);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b25) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b25);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else if (view == b26) {
			mPlayer = MediaPlayer.create(BenjonbornoActivity1.this, R.raw.b26);
			mPlayer.start();
			releaseMediaPlayerResource(mPlayer);
		} else {
			Intent intent = new Intent(BenjonbornoActivity1.this,
					BenjonBornoActivity2.class);
			startActivity(intent);
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
