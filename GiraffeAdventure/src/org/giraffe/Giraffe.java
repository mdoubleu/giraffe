package org.giraffe;


import org.giraffe.GameView.GameThread;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Giraffe extends Activity implements OnClickListener{

	GameView theGame;
	GameThread gameThread;
	LinearLayout mLinearLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        theGame=(GameView) findViewById(R.id.game);
        gameThread=theGame.getThread();
        
    //View playButton=findViewById(R.id.play_button);
    //playButton.setOnClickListener(this);

    }
    public void onClick(View v) {
		/*
    	if(v.getId()==R.id.play_button){
			
    		mLinearLayout=new LinearLayout(this);
    		ImageView i = new ImageView(this);
			    i.setImageResource(R.drawable.a);
			    i.setAdjustViewBounds(true); // set the ImageView bounds to match the Drawable's dimensions
			    i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

			    // Add the ImageView to the layout and set the layout as the content view
			    mLinearLayout.addView(i);
			    setContentView(mLinearLayout)
			    */
	}

}