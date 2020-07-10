package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    //마이페이지가 열렸는지 확인하는 변수
    boolean isPageOpen = false;
    Animation tranlateBottomAnim;
    Animation tranlateTopAnim;

//    ScrollView page;
    ImageButton widget_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        page = findViewById(R.id.mypage);

        tranlateBottomAnim = AnimationUtils.loadAnimation(this,R.anim.mypage);
        tranlateTopAnim = AnimationUtils.loadAnimation(this, R.anim.mypage2);

//        SlidingPageAnimationListener animListener = new SlidingPageAnimationListener();

//        tranlateBottomAnim.setAnimationListener(animListener);
//        tranlateTopAnim.setAnimationListener(animListener);

        widget_button = findViewById(R.id.widget_button);
        widget_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(isPageOpen){
//                    page.startAnimation(tranlateTopAnim);
                    Intent intent = new Intent(getApplicationContext(), mypage.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.mypage,R.anim.hold);
//                }else {
//                    page.setVisibility(View.VISIBLE);
//                    page.startAnimation(tranlateBottomAnim);
//                }
            }
        });
    }

//    private class SlidingPageAnimationListener implements Animation.AnimationListener{
//        @Override
//        public void onAnimationStart(Animation animation){
//
//        }
//        public void onAnimationEnd(Animation animation){
//            if(isPageOpen){
//                page.setVisibility(View.INVISIBLE);
//                isPageOpen=false;
//            } else{
//                isPageOpen = true;
//            }
//        }
//        @Override
//        public void onAnimationRepeat(Animation animation){
//
//        }
//    }

}