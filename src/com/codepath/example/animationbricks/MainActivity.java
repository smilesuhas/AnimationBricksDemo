package com.codepath.example.animationbricks;

import java.util.zip.Inflater;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ArgbEvaluator;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.ValueAnimator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;
import static com.nineoldandroids.view.ViewPropertyAnimator.animate;
public class MainActivity extends Activity {
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;

	private Button btn1111;
	private Button btn11;
	private Button btn111;
	
	private Button btn2222;
	private Button btn22;
	private Button btn222;

	private Button btn3333;
	private Button btn33;
	private Button btn333;
	private Button btn4444;
	private Button btn44;
	private Button btn444;
	private TextView tvSwipe;

	public int count1=0;
	public int height1=0;
	public int count2=0;
	public int height2=0;
	public int count3=0;
	public int height3=0;
	public int count4=0;
	public int height4=0;

	public int alldone=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	//	View view = Inflater.inflate(R.layout.activity_main, parent, false);
	 
		btn1 = (Button)  findViewById(R.id.btn1);
		btn2 = (Button)  findViewById(R.id.btn2);
		btn3 = (Button)  findViewById(R.id.btn3);
		btn4 = (Button)  findViewById(R.id.btn4);

		btn1111 = (Button)  findViewById(R.id.btn1111);
		btn11 = (Button)  findViewById(R.id.btn11);
		btn111 = (Button)  findViewById(R.id.btn111);

		btn2222 = (Button)  findViewById(R.id.btn2222);
		btn22 = (Button)  findViewById(R.id.btn22);
		btn222 = (Button)  findViewById(R.id.btn222);
		
		btn3333 = (Button)  findViewById(R.id.btn3333);
		btn33 = (Button)  findViewById(R.id.btn33);
		btn333 = (Button)  findViewById(R.id.btn333);
		
		btn4444 = (Button)  findViewById(R.id.btn4444);
		btn44 = (Button)  findViewById(R.id.btn44);
		btn444 = (Button)  findViewById(R.id.btn444);
		tvSwipe =  (TextView) findViewById(R.id.tvSwipe);
		
		tvSwipe.setOnTouchListener(new OnSwipeTouchListener(this) {

	 @Override
	public void onSwipeRight() {
		// TODO Auto-generated method stub
		 if(alldone>=4){
 				 btn1.setBackgroundColor(Color.GREEN);
 				 btn2.setBackgroundColor(Color.GREEN);
 				 btn3.setBackgroundColor(Color.GREEN);
 				 btn4.setBackgroundColor(Color.GREEN);

 			 btn1.animate().xBy(2000).yBy(-1000).setDuration(2000);
			 btn2.animate().xBy(2000).yBy(-1000).setDuration(2000);
			 btn3.animate().xBy(2000).yBy(-1000).setDuration(2000);
			 btn4.animate().xBy(2000).yBy(-1000).setDuration(2000);
		 }
	//	super.onSwipeRight();
		 Handler h=new Handler();
		 h.postDelayed(new Runnable(){
		 public void run(){
			 tvSwipe.setText("You are a brick!!");
			 tvSwipe.setBackgroundColor(Color.GREEN);
		 }
		 }, 1500);

	}
	 
		} )	;	
		 
 
	}
	
	public void btn1111Clicked(View v) {
		// Setup scale Y 
		ObjectAnimator scaleAnim101 = null;
		ObjectAnimator scaleAnim1=null;
		ObjectAnimator scaleAnimColor1=null;
		
		if(count1==0){
		 scaleAnim101 = ObjectAnimator.ofFloat(btn11, "alpha", 0);
 		height1=142;
		
		} else if (count1==1) {
			 scaleAnim101 = ObjectAnimator.ofFloat(btn111, "alpha", 0);
			// height1=284;
 		}else if (count1==2) {
			 scaleAnim101 = ObjectAnimator.ofFloat(btn1111, "alpha", 0);
			// height1=426;

		}
		scaleAnim101.setDuration(500);

  		 scaleAnim1 = ObjectAnimator.ofFloat(btn1, "translationY", height1);
		scaleAnim1.setDuration(500);
 		AnimatorSet set = new AnimatorSet();
 		 if (height1==426){
			  scaleAnimColor1 = ObjectAnimator.ofObject(btn1, "backgroundColor", new ArgbEvaluator(),
			          /*Red*/0xFFFF8080, /*Blue*/0xFF8080FF);
			 scaleAnimColor1.setDuration(100);
				set.playSequentially(scaleAnim101, scaleAnim1,scaleAnimColor1);

		 } else{
		set.playSequentially(scaleAnim101, scaleAnim1);
		 }
		set.start();		
		count1=count1+1;
		if (height1==426){
 		//btn1.setBackgroundColor(Color.GREEN);
 		alldone=alldone+1;
		}
		height1=142+height1;
		if(alldone==4){
			tvSwipe.setText("Swipe right to throw the bricks");
		}
	}
	
	public void btn2222Clicked(View v) {
		// Setup scale Y 
		ObjectAnimator scaleAnim202 = null;
		ObjectAnimator scaleAnim2=null;
		ObjectAnimator scaleAnimColor2=null;
		
		if(count2==0){
			scaleAnim202 = ObjectAnimator.ofFloat(btn22, "alpha", 0);
 		height2=142;
		
		} else if (count2==1) {
			scaleAnim202 = ObjectAnimator.ofFloat(btn222, "alpha", 0);
			// height1=284;
 		}else if (count2==2) {
 			scaleAnim202 = ObjectAnimator.ofFloat(btn2222, "alpha", 0);
			// height1=426;

		}
		scaleAnim202.setDuration(500);

		scaleAnim2 = ObjectAnimator.ofFloat(btn2, "translationY", height2);
		scaleAnim2.setDuration(500);
 		AnimatorSet set = new AnimatorSet();
 		 if (height2==426){
 			scaleAnimColor2 = ObjectAnimator.ofObject(btn2, "backgroundColor", new ArgbEvaluator(),
			          /*Red*/0xFFFF8080, /*Blue*/0xFF8080FF);
 			scaleAnimColor2.setDuration(100);
				set.playSequentially(scaleAnim202, scaleAnim2,scaleAnimColor2);

		 } else{
		set.playSequentially(scaleAnim202, scaleAnim2);
		 }
		set.start();		
		count2=count2+1;
		if (height2==426){
 		//btn1.setBackgroundColor(Color.GREEN);
 		alldone=alldone+1;
		}
		height2=142+height2;
		if(alldone==4){
			tvSwipe.setText("Swipe right to throw the bricks");
		}
	}
	public void btn3333Clicked(View v) {
		// Setup scale Y 
		ObjectAnimator scaleAnim303 = null;
		ObjectAnimator scaleAnim3=null;
		ObjectAnimator scaleAnimColor3=null;
		
		if(count3==0){
			scaleAnim303 = ObjectAnimator.ofFloat(btn33, "alpha", 0);
 		height3=142;
		
		} else if (count3==1) {
			scaleAnim303 = ObjectAnimator.ofFloat(btn333, "alpha", 0);
			// height1=284;
 		}else if (count3==2) {
 			scaleAnim303 = ObjectAnimator.ofFloat(btn3333, "alpha", 0);
			// height1=426;

		}
		scaleAnim303.setDuration(500);

		scaleAnim3 = ObjectAnimator.ofFloat(btn3, "translationY", height3);
		scaleAnim3.setDuration(500);
 		AnimatorSet set = new AnimatorSet();
 		 if (height3==426){
 			scaleAnimColor3 = ObjectAnimator.ofObject(btn3, "backgroundColor", new ArgbEvaluator(),
			          /*Red*/0xFFFF8080, /*Blue*/0xFF8080FF);
			  scaleAnimColor3.setDuration(100);
				set.playSequentially(scaleAnim303, scaleAnim3,scaleAnimColor3);

		 } else{
		set.playSequentially(scaleAnim303, scaleAnim3);
		 }
		set.start();		
		count3=count3+1;
		if (height3==426){
 		//btn1.setBackgroundColor(Color.GREEN);
 		alldone=alldone+1;
		}
		height3=142+height3;
		if(alldone==4){
			tvSwipe.setText("Swipe right to throw the bricks");
		}
	}
	public void btn4444Clicked(View v) {
		// Setup scale Y 
		ObjectAnimator scaleAnim404 = null;
		ObjectAnimator scaleAnim4=null;
		ObjectAnimator scaleAnimColor4=null;
		
		if(count4==0){
			scaleAnim404 = ObjectAnimator.ofFloat(btn44, "alpha", 0);
 		height4=142;
		
		} else if (count4==1) {
			scaleAnim404 = ObjectAnimator.ofFloat(btn444, "alpha", 0);
			// height1=284;
 		}else if (count4==2) {
 			scaleAnim404 = ObjectAnimator.ofFloat(btn4444, "alpha", 0);
			// height1=426;

		}
		scaleAnim404.setDuration(500);

		scaleAnim4 = ObjectAnimator.ofFloat(btn4, "translationY", height4);
		scaleAnim4.setDuration(500);
 		AnimatorSet set = new AnimatorSet();
 		 if (height4==426){
 			scaleAnimColor4 = ObjectAnimator.ofObject(btn4, "backgroundColor", new ArgbEvaluator(),
			          /*Red*/0xFFFF8080, /*Blue*/0xFF8080FF);
 			scaleAnimColor4.setDuration(100);
				set.playSequentially(scaleAnim404, scaleAnim4,scaleAnimColor4);

		 } else{
		set.playSequentially(scaleAnim404, scaleAnim4);
		 }
		set.start();		
		count4=count4+1;
		if (height4==426){
 		//btn1.setBackgroundColor(Color.GREEN);
 		alldone=alldone+1;
		}
		if(alldone==4){
			tvSwipe.setText("Swipe right to throw the bricks");
		}
		height4=142+height4;
	}

}
