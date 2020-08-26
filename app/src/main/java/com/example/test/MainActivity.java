package com.example.test;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Animation tranlateBottomAnim;
    Animation tranlateTopAnim;
    int weatherstate = 0, moneystate = 0, webtoonstate = 0, gostate = 0;
    int weatherresultstate = 0;
    String gourl;
    View.OnClickListener close = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.weatherclose:
                    if (weatherstate == 0) {
                        mBinding.weatherlist.setVisibility(View.GONE);
                        mBinding.weatherresult.setVisibility(View.GONE);
                        mBinding.weatherlast.setVisibility(View.GONE);
                        weatherstate = 1;
                        mBinding.weatherclose.setImageResource(R.drawable.close2);
                    } else {
                        mBinding.weatherlist.setVisibility(View.VISIBLE);
                        mBinding.weatherresult.setVisibility(View.VISIBLE);
                        mBinding.weatherlast.setVisibility(View.VISIBLE);
                        mBinding.weatherclose.setImageResource(R.drawable.close);
                        weatherstate = 0;
                    }
                    break;
                case R.id.moneyclose:
                    if (moneystate == 0) {
                        mBinding.money3.setVisibility(View.GONE);
                        mBinding.moenybutton.setVisibility(View.GONE);
                        mBinding.moneylist1.setVisibility(View.GONE);
                        mBinding.moneylist2.setVisibility(View.GONE);
                        mBinding.moneylist3.setVisibility(View.GONE);
                        mBinding.moneylist4.setVisibility(View.GONE);
                        mBinding.moneylistview1.setVisibility(View.GONE);
                        mBinding.moneylistview2.setVisibility(View.GONE);
                        mBinding.moneyclose.setImageResource(R.drawable.close2);
                        moneystate = 1;
                    } else {
                        mBinding.money3.setVisibility(View.VISIBLE);
                        mBinding.moenybutton.setVisibility(View.VISIBLE);
                        mBinding.moneylist1.setVisibility(View.VISIBLE);
                        mBinding.moneylist2.setVisibility(View.VISIBLE);
                        mBinding.moneylist3.setVisibility(View.VISIBLE);
                        mBinding.moneylist4.setVisibility(View.VISIBLE);
                        mBinding.moneylistview1.setVisibility(View.VISIBLE);
                        mBinding.moneylistview2.setVisibility(View.VISIBLE);
                        mBinding.moneyclose.setImageResource(R.drawable.close);
                        moneystate = 0;
                    }
                    break;
                case R.id.webtoonclose:
                    if (webtoonstate == 0) {
                        mBinding.webtoonlist.setVisibility(View.GONE);
                        mBinding.webtoonview.setVisibility(View.GONE);
                        mBinding.recommand.setVisibility(View.GONE);
                        mBinding.recommand1.setVisibility(View.GONE);
                        mBinding.recommand2.setVisibility(View.GONE);
                        mBinding.recommand3.setVisibility(View.GONE);
                        mBinding.webtoonlast.setVisibility(View.GONE);
                        mBinding.webtoonclose.setImageResource(R.drawable.close2);
                        webtoonstate = 1;
                    } else {
                        mBinding.webtoonlist.setVisibility(View.VISIBLE);
                        mBinding.webtoonview.setVisibility(View.VISIBLE);
                        mBinding.recommand.setVisibility(View.VISIBLE);
                        mBinding.recommand1.setVisibility(View.VISIBLE);
                        mBinding.recommand2.setVisibility(View.VISIBLE);
                        mBinding.recommand3.setVisibility(View.VISIBLE);
                        mBinding.webtoonlast.setVisibility(View.VISIBLE);
                        mBinding.webtoonclose.setImageResource(R.drawable.close);
                        webtoonstate = 0;
                    }
                    break;
                case R.id.goclose:
                    if (gostate == 0) {
                        mBinding.golist1.setVisibility(View.GONE);
                        mBinding.golist2.setVisibility(View.GONE);
                        mBinding.goclose.setImageResource(R.drawable.close2);
                        gostate = 1;
                    } else {
                        mBinding.golist1.setVisibility(View.VISIBLE);
                        mBinding.golist2.setVisibility(View.VISIBLE);
                        mBinding.goclose.setImageResource(R.drawable.close);
                        gostate = 0;
                    }
                    break;
            }
        }
    };
    View.OnClickListener weather = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.timeweather:
                    mBinding.weatherresult.setImageResource(R.drawable.wether);
                    mBinding.timeweather.setTextColor(Color.parseColor("#FFFFFF"));
                    mBinding.timeweather.setBackgroundColor(Color.parseColor("#7393CC"));
                    mBinding.timedust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekdust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherresultstate = 0;
                    break;
                case R.id.timedust:
                    mBinding.weatherresult.setImageResource(R.drawable.daydust);
                    mBinding.timeweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.timedust.setTextColor(Color.parseColor("#FFFFFF"));
                    mBinding.timedust.setBackgroundColor(Color.parseColor("#7393CC"));
                    mBinding.weekweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekdust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherresultstate = 1;
                    break;
                case R.id.weekweather:
                    mBinding.weatherresult.setImageResource(R.drawable.weekweather);
                    mBinding.timeweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.timedust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekweather.setTextColor(Color.parseColor("#FFFFFF"));
                    mBinding.weekweather.setBackgroundColor(Color.parseColor("#7393CC"));
                    mBinding.weekdust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherstate = 2;
                    break;
                case R.id.weekdust:
                    mBinding.weatherresult.setImageResource(R.drawable.weekdust);
                    mBinding.timeweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.timedust.setTextColor(Color.parseColor("#73767F"));
                    mBinding.timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekweather.setTextColor(Color.parseColor("#73767F"));
                    mBinding.weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    mBinding.weekdust.setTextColor(Color.parseColor("#FFFFFF"));
                    mBinding.weekdust.setBackgroundColor(Color.parseColor("#7393CC"));
                    weatherresultstate = 3;
                    break;
            }
        }
    };
    View.OnClickListener url = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.weatherbutton1:
                    gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=13111714";
                    break;
                case R.id.now:
                    gourl = "https://now.naver.com/583";
                    break;
                case R.id.weatherresult:
                    if (weatherresultstate == 0) {
                        gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=13111714";
                    } else if (weatherresultstate == 1) {
                        gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=13111714&default=air";
                    } else if (weatherresultstate == 2) {
                        gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=13111714";
                    } else {
                        gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=13111714&default=air";
                    }
                    break;
                case R.id.weatherlast:
                    gourl = "https://m.weather.naver.com/m/main.nhn?regionCode=131111714";
                    break;
                case R.id.money1:
                    gourl = "https://m.stock.naver.com/sise/siseIndex.nhn?code=KOSDAQ";
                    break;
                case R.id.money2:
                    gourl = "https://m.stock.naver.com/marketindex/item.nhn?marketindexCd=FX_USDKRW&amp;menu=exchange";
                    break;
                case R.id.chart:
                    gourl = "https://m.stock.naver.com/sise/siseList.nhn?menu=top_search&sosok=2#siseMenuList";
                    break;
                case R.id.moneylist1:
                    gourl = "https://m.stock.naver.com/item/main.nhn#/stocks/019170/total";
                    break;
                case R.id.moneylist2:
                    gourl = "https://m.stock.naver.com/item/main.nhn#/stocks/035720/total";
                    break;
                case R.id.moneylist3:
                    gourl = "https://m.stock.naver.com/item/main.nhn#/stocks/096530/total";
                    break;
                case R.id.moneysearch:
                    gourl = "https://m.stock.naver.com/searchItem.nhn?searchType=init";
                    break;
                case R.id.korea:
                    gourl = "https://m.stock.naver.com/sise/siseList.nhn?menu=market_sum&sosok=0";
                    break;
                case R.id.moneyview3:
                    gourl = "https://m.stock.naver.com";
                    break;
                case R.id.webtoonlist1:
                    gourl = "https://m.comic.naver.com/webtoon/list.nhn?titleId=698888";
                    break;
                case R.id.webtoonlist2:
                    gourl = "https://m.comic.naver.com/webtoon/list.nhn?titleId=654774";
                    break;
                case R.id.gorecommand1:
                    gourl = "https://m.comic.naver.com/webtoon/list.nhn?titleId=709731";
                    break;
                case R.id.episode1:
                    gourl = "https://m.comic.naver.com/webtoon/detail.nhn?titleId=709731&no=1";
                    break;
                case R.id.gorecommand2:
                    gourl = "https://m.comic.naver.com/webtoon/list.nhn?titleId=730174";
                    break;
                case R.id.episode2:
                    gourl = "https://m.comic.naver.com/webtoon/detail.nhn?titleId=730174&no=1";
                    break;
                case R.id.gorecommand3:
                    gourl = "https://m.comic.naver.com/webtoon/list.nhn?titleId=726212";
                    break;
                case R.id.episode3:
                    gourl = "https://m.comic.naver.com/webtoon/detail.nhn?titleId=726212&no=1b";
                    break;
                case R.id.webtoonhome:
                    gourl = "https://m.comic.naver.com/index.nhn";
                    break;
                case R.id.daywebtoon:
                    gourl = "https://m.comic.naver.com/webtoon/weekday.nhn?week=mon";
                    break;
                case R.id.best:
                    gourl = "https://m.comic.naver.com/bestChallenge/genre.nhn";
                    break;
                case R.id.mail:
                    gourl = "https://m.mail.naver.com";
                    break;
                case R.id.keep:
                    gourl = "https://m.keep.naver.com";
                    break;
                case R.id.cafe:
                    gourl = "https://m.cafe.naver.com/ca-fe";
                    break;
                case R.id.blog:
                    gourl = "https://m.blog.naver.com/FeedList.nhn";
                    break;
                case R.id.shopping:
                    gourl = "https://m.shopping.naver.com/home/m/index.nhn";
                    break;
                case R.id.pay:
                    gourl = "https://new-m.pay.naver.com";
                    break;
                case R.id.gowebtoon:
                    gourl = "https://m.comic.naver.com/index.nhn";
                    break;
                case R.id.in:
                    gourl = "https://m.kin.naver.com/mobile/index.nhn";
                    break;
                case R.id.pc:
                    gourl = "https://www.naver.com/?mobile";
                    break;
                case R.id.use:
                    gourl = "https://policy.naver.com/policy-mobile/term.html?type=1?type=1";
                    break;
                case R.id.person:
                    gourl = "https://policy.naver.com/policy-mobile/privacy.html";
                    break;
                case R.id.center:
                    gourl = "https://m.help.naver.com/support/index.help";
                    break;
                case R.id.pay_button:
                    gourl = "https://new-m.pay.naver.com";
                    break;
            }
            Intent intent = new Intent(getApplicationContext(), webview.class);
            intent.putExtra("url", gourl);
            startActivity(intent);
        }
    };
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        tranlateBottomAnim = AnimationUtils.loadAnimation(this, R.anim.mypage);
        tranlateTopAnim = AnimationUtils.loadAnimation(this, R.anim.mypage2);


        mBinding.weatherclose.setOnClickListener(close);
        mBinding.moneyclose.setOnClickListener(close);
        mBinding.webtoonclose.setOnClickListener(close);
        mBinding.goclose.setOnClickListener(close);
        mBinding.timeweather.setOnClickListener(weather);
        mBinding.timedust.setOnClickListener(weather);
        mBinding.weekweather.setOnClickListener(weather);
        mBinding.weekdust.setOnClickListener(weather);
        mBinding.weatherbutton1.setOnClickListener(url);
        mBinding.now.setOnClickListener(url);
        mBinding.weatherresult.setOnClickListener(url);
        mBinding.weatherlast.setOnClickListener(url);
        mBinding.money1.setOnClickListener(url);
        mBinding.money2.setOnClickListener(url);
        mBinding.chart.setOnClickListener(url);
        mBinding.moneylist1.setOnClickListener(url);
        mBinding.moneylist2.setOnClickListener(url);
        mBinding.moneylist3.setOnClickListener(url);
        mBinding.moneysearch.setOnClickListener(url);
        mBinding.korea.setOnClickListener(url);
        mBinding.moneyview3.setOnClickListener(url);
        mBinding.webtoonlist1.setOnClickListener(url);
        mBinding.webtoonlist2.setOnClickListener(url);
        mBinding.gorecommand1.setOnClickListener(url);
        mBinding.episode1.setOnClickListener(url);
        mBinding.gorecommand2.setOnClickListener(url);
        mBinding.episode2.setOnClickListener(url);
        mBinding.gorecommand3.setOnClickListener(url);
        mBinding.episode3.setOnClickListener(url);
        mBinding.webtoonhome.setOnClickListener(url);
        mBinding.daywebtoon.setOnClickListener(url);
        mBinding.best.setOnClickListener(url);
        mBinding.mail.setOnClickListener(url);
        mBinding.keep.setOnClickListener(url);
        mBinding.cafe.setOnClickListener(url);
        mBinding.blog.setOnClickListener(url);
        mBinding.shopping.setOnClickListener(url);
        mBinding.pay.setOnClickListener(url);
        mBinding.gowebtoon.setOnClickListener(url);
        mBinding.in.setOnClickListener(url);
        mBinding.pc.setOnClickListener(url);
        mBinding.use.setOnClickListener(url);
        mBinding.person.setOnClickListener(url);
        mBinding.center.setOnClickListener(url);
        mBinding.naver.setOnClickListener(url);
        mBinding.payButton.setOnClickListener(url);
        mBinding.widgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mypage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.mypage, R.anim.hold);
            }
        });

        mBinding.searchbox.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), search.class);
                startActivity(intent);
                overridePendingTransition(R.anim.mypage, R.anim.hold);
            }
        });

    }
}