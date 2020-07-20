package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation tranlateBottomAnim;
    Animation tranlateTopAnim;
    int weatherstate = 0, moneystate = 0, webtoonstate = 0, gostate = 0;
    int weatherresultstate = 0;

    ImageButton widget_button, pay_button, box_button, weatherclose, moneyclose, webtoonclose, goclose;
    HorizontalScrollView weatherlist, webtoonlist;
    ImageButton ad1, ad2, ad3, weatherbutton1, now, weatherresult, restart;
    Button weatherbutton, button5, timeweather, timedust, weekweather, weekdust, weatherlast, chart;
    Button moneychart, add, change, setting, logout, allservice, pc, use, person, center;
    LinearLayout money1, money2, money3, moneysearch, korea, moneyview3;
    LinearLayout webtoonlist1, webtoonlist2, recommand1, recommand2, recommand3, webtoonhome, daywebtoon, best, webtoonlast, gorecommand1, gorecommand2, gorecommand3, episode1, episode2, episode3;
    LinearLayout mail, keep, cafe, blog, shopping, pay, gowebtoon, in, golist1, golist2;
    RelativeLayout moneybutton, moneylist1, moneylist2, moneylist3, moneylist4;
    View moneylistview1, moneylistview2, webtoonview;
    TextView recommand;
    String gourl;
    ImageView naver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tranlateBottomAnim = AnimationUtils.loadAnimation(this, R.anim.mypage);
        tranlateTopAnim = AnimationUtils.loadAnimation(this, R.anim.mypage2);

        weatherclose = findViewById(R.id.weatherclose);
        weatherresult = findViewById(R.id.weatherresult);
        weatherlist = findViewById(R.id.weatherlist);
        weatherlast = findViewById(R.id.weatherlast);

        moneyclose = findViewById(R.id.moneyclose);
        money3 = findViewById(R.id.money3);
        moneybutton = findViewById(R.id.moenybutton);
        moneylist1 = findViewById(R.id.moneylist1);
        moneylist2 = findViewById(R.id.moneylist2);
        moneylist3 = findViewById(R.id.moneylist3);
        moneylist4 = findViewById(R.id.moneylist4);
        moneylistview1 = findViewById(R.id.moneylistview1);
        moneylistview2 = findViewById(R.id.moneylistview2);

        webtoonclose = findViewById(R.id.webtoonclose);
        webtoonlist = findViewById(R.id.webtoonlist);
        webtoonview = findViewById(R.id.webtoonview);
        recommand = findViewById(R.id.recommand);
        recommand1 = findViewById(R.id.recommand1);
        recommand2 = findViewById(R.id.recommand2);
        recommand3 = findViewById(R.id.recommand3);
        webtoonlast = findViewById(R.id.webtoonlast);

        goclose = findViewById(R.id.goclose);
        golist1 = findViewById(R.id.golist1);
        golist2 = findViewById(R.id.golist2);

        weatherclose.setOnClickListener(close);
        moneyclose.setOnClickListener(close);
        webtoonclose.setOnClickListener(close);
        goclose.setOnClickListener(close);

        timeweather = findViewById(R.id.timeweather);
        timedust = findViewById(R.id.timedust);
        weekweather = findViewById(R.id.weekweather);
        weekdust = findViewById(R.id.weekdust);

        timeweather.setOnClickListener(weather);
        timedust.setOnClickListener(weather);
        weekweather.setOnClickListener(weather);
        weekdust.setOnClickListener(weather);

        weatherbutton1 = findViewById(R.id.weatherbutton1);
        now = findViewById(R.id.now);
        weatherresult = findViewById(R.id.weatherresult);
        weatherlast = findViewById(R.id.weatherlast);
        money1 = findViewById(R.id.money1);
        money2 = findViewById(R.id.money2);
        chart = findViewById(R.id.chart);
        moneylist1 = findViewById(R.id.moneylist1);
        moneylist2 = findViewById(R.id.moneylist2);
        moneylist3 = findViewById(R.id.moneylist3);
        moneysearch = findViewById(R.id.moneysearch);
        korea = findViewById(R.id.korea);
        moneyview3 = findViewById(R.id.moneyview3);
        webtoonlist1 = findViewById(R.id.webtoonlist1);
        webtoonlist2 = findViewById(R.id.webtoonlist2);
        gorecommand1 = findViewById(R.id.gorecommand1);
        episode1 = findViewById(R.id.episode1);
        gorecommand2 = findViewById(R.id.gorecommand2);
        episode2 = findViewById(R.id.episode2);
        gorecommand3 = findViewById(R.id.gorecommand3);
        episode3 = findViewById(R.id.episode3);
        webtoonhome = findViewById(R.id.webtoonhome);
        daywebtoon = findViewById(R.id.daywebtoon);
        best = findViewById(R.id.best);
        mail = findViewById(R.id.mail);
        keep = findViewById(R.id.keep);
        cafe = findViewById(R.id.cafe);
        blog = findViewById(R.id.blog);
        shopping = findViewById(R.id.shopping);
        pay = findViewById(R.id.pay);
        gowebtoon = findViewById(R.id.gowebtoon);
        in = findViewById(R.id.in);
        pc = findViewById(R.id.pc);
        use = findViewById(R.id.use);
        person = findViewById(R.id.person);
        center = findViewById(R.id.center);
        naver = findViewById(R.id.naver);
        pay_button = findViewById(R.id.pay_button);

        weatherbutton1.setOnClickListener(url);
        now.setOnClickListener(url);
        weatherresult.setOnClickListener(url);
        weatherlast.setOnClickListener(url);
        money1.setOnClickListener(url);
        money2.setOnClickListener(url);
        chart.setOnClickListener(url);
        moneylist1.setOnClickListener(url);
        moneylist2.setOnClickListener(url);
        moneylist3.setOnClickListener(url);
        moneysearch.setOnClickListener(url);
        korea.setOnClickListener(url);
        moneyview3.setOnClickListener(url);
        webtoonlist1.setOnClickListener(url);
        webtoonlist2.setOnClickListener(url);
        gorecommand1.setOnClickListener(url);
        episode1.setOnClickListener(url);
        gorecommand2.setOnClickListener(url);
        episode2.setOnClickListener(url);
        gorecommand3.setOnClickListener(url);
        episode3.setOnClickListener(url);
        webtoonhome.setOnClickListener(url);
        daywebtoon.setOnClickListener(url);
        best.setOnClickListener(url);
        mail.setOnClickListener(url);
        keep.setOnClickListener(url);
        cafe.setOnClickListener(url);
        blog.setOnClickListener(url);
        shopping.setOnClickListener(url);
        pay.setOnClickListener(url);
        gowebtoon.setOnClickListener(url);
        in.setOnClickListener(url);
        pc.setOnClickListener(url);
        use.setOnClickListener(url);
        person.setOnClickListener(url);
        center.setOnClickListener(url);
        naver.setOnClickListener(url);
        pay_button.setOnClickListener(url);

        widget_button = findViewById(R.id.widget_button);
        widget_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mypage.class);
                startActivity(intent);
                overridePendingTransition(R.anim.mypage, R.anim.hold);
            }
        });

    }

    View.OnClickListener close = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.weatherclose:
                    if (weatherstate == 0) {
                        weatherlist.setVisibility(View.GONE);
                        weatherresult.setVisibility(View.GONE);
                        weatherlast.setVisibility(View.GONE);
                        weatherstate = 1;
                        weatherclose.setImageResource(R.drawable.close2);
                    } else {
                        weatherlist.setVisibility(View.VISIBLE);
                        weatherresult.setVisibility(View.VISIBLE);
                        weatherlast.setVisibility(View.VISIBLE);
                        weatherclose.setImageResource(R.drawable.close);
                        weatherstate = 0;
                    }
                    break;
                case R.id.moneyclose:
                    if (moneystate == 0) {
                        money3.setVisibility(View.GONE);
                        moneybutton.setVisibility(View.GONE);
                        moneylist1.setVisibility(View.GONE);
                        moneylist2.setVisibility(View.GONE);
                        moneylist3.setVisibility(View.GONE);
                        moneylist4.setVisibility(View.GONE);
                        moneylistview1.setVisibility(View.GONE);
                        moneylistview2.setVisibility(View.GONE);
                        moneyclose.setImageResource(R.drawable.close2);
                        moneystate = 1;
                    } else {
                        money3.setVisibility(View.VISIBLE);
                        moneybutton.setVisibility(View.VISIBLE);
                        moneylist1.setVisibility(View.VISIBLE);
                        moneylist2.setVisibility(View.VISIBLE);
                        moneylist3.setVisibility(View.VISIBLE);
                        moneylist4.setVisibility(View.VISIBLE);
                        moneylistview1.setVisibility(View.VISIBLE);
                        moneylistview2.setVisibility(View.VISIBLE);
                        moneyclose.setImageResource(R.drawable.close);
                        moneystate = 0;
                    }
                    break;
                case R.id.webtoonclose:
                    if (webtoonstate == 0) {
                        webtoonlist.setVisibility(View.GONE);
                        webtoonview.setVisibility(View.GONE);
                        recommand.setVisibility(View.GONE);
                        recommand1.setVisibility(View.GONE);
                        recommand2.setVisibility(View.GONE);
                        recommand3.setVisibility(View.GONE);
                        webtoonlast.setVisibility(View.GONE);
                        webtoonclose.setImageResource(R.drawable.close2);
                        webtoonstate = 1;
                    } else {
                        webtoonlist.setVisibility(View.VISIBLE);
                        webtoonview.setVisibility(View.VISIBLE);
                        recommand.setVisibility(View.VISIBLE);
                        recommand1.setVisibility(View.VISIBLE);
                        recommand2.setVisibility(View.VISIBLE);
                        recommand3.setVisibility(View.VISIBLE);
                        webtoonlast.setVisibility(View.VISIBLE);
                        webtoonclose.setImageResource(R.drawable.close);
                        webtoonstate = 0;
                    }
                    break;
                case R.id.goclose:
                    if (gostate == 0) {
                        golist1.setVisibility(View.GONE);
                        golist2.setVisibility(View.GONE);
                        goclose.setImageResource(R.drawable.close2);
                        gostate = 1;
                    } else {
                        golist1.setVisibility(View.VISIBLE);
                        golist2.setVisibility(View.VISIBLE);
                        goclose.setImageResource(R.drawable.close);
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
                    weatherresult.setImageResource(R.drawable.wether);
                    timeweather.setTextColor(Color.parseColor("#FFFFFF"));
                    timeweather.setBackgroundColor(Color.parseColor("#7393CC"));
                    timedust.setTextColor(Color.parseColor("#73767F"));
                    timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekweather.setTextColor(Color.parseColor("#73767F"));
                    weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekdust.setTextColor(Color.parseColor("#73767F"));
                    weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherresultstate = 0;
                    break;
                case R.id.timedust:
                    weatherresult.setImageResource(R.drawable.daydust);
                    timeweather.setTextColor(Color.parseColor("#73767F"));
                    timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    timedust.setTextColor(Color.parseColor("#FFFFFF"));
                    timedust.setBackgroundColor(Color.parseColor("#7393CC"));
                    weekweather.setTextColor(Color.parseColor("#73767F"));
                    weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekdust.setTextColor(Color.parseColor("#73767F"));
                    weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherresultstate = 1;
                    break;
                case R.id.weekweather:
                    weatherresult.setImageResource(R.drawable.weekweather);
                    timeweather.setTextColor(Color.parseColor("#73767F"));
                    timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    timedust.setTextColor(Color.parseColor("#73767F"));
                    timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekweather.setTextColor(Color.parseColor("#FFFFFF"));
                    weekweather.setBackgroundColor(Color.parseColor("#7393CC"));
                    weekdust.setTextColor(Color.parseColor("#73767F"));
                    weekdust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weatherstate = 2;
                    break;
                case R.id.weekdust:
                    weatherresult.setImageResource(R.drawable.weekdust);
                    timeweather.setTextColor(Color.parseColor("#73767F"));
                    timeweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    timedust.setTextColor(Color.parseColor("#73767F"));
                    timedust.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekweather.setTextColor(Color.parseColor("#73767F"));
                    weekweather.setBackgroundColor(Color.parseColor("#F3F6FD"));
                    weekdust.setTextColor(Color.parseColor("#FFFFFF"));
                    weekdust.setBackgroundColor(Color.parseColor("#7393CC"));
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

}