package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.test.databinding.ActivitySearchBinding;

public class search extends AppCompatActivity {
    private ActivitySearchBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_search);

        mBinding.searchArrow.setOnClickListener(search);
        mBinding.searchButton.setOnClickListener(search);
    }

    View.OnClickListener search = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.search_arrow:
                    finish();
                    break;
                case R.id.search_button:
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);

                    intent.putExtra(SearchManager.QUERY, "검색할 단어");
                    startActivity(intent);
                    break;
            }
        }
    };
}