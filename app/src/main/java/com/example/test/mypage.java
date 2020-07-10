package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class mypage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.hold,R.anim.mypage2);

    }
}