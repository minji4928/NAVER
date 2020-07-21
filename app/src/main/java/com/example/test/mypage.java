package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.example.test.databinding.ActivityMypageBinding;

import java.util.ArrayList;

public class mypage extends AppCompatActivity {

    private ActivityMypageBinding mBinding;
    String gourl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_mypage);

        mBinding.vpTestVp.setOffscreenPageLimit(2);

        MoviePagerAdapter adapter = new MoviePagerAdapter(getSupportFragmentManager());

        MypageList fragment1 = new MypageList();
        adapter.addItem(fragment1);

        MypageList2 fragment2 = new MypageList2();
        adapter.addItem(fragment2);

        mBinding.vpTestVp.setAdapter(adapter);

        mBinding.indicator.setViewPager(mBinding.vpTestVp);

        mBinding.exitbutton.setOnClickListener(new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        mBinding.mybutton.setOnClickListener(web);
        mBinding.qrbutton.setOnClickListener(web);
        mBinding.allservice1.setOnClickListener(web);
        mBinding.naverplus.setOnClickListener(web);
        mBinding.context.setOnClickListener(web);
        mBinding.naverpay.setOnClickListener(web);
        mBinding.naverpayhome.setOnClickListener(web);
        mBinding.naverpaymoney.setOnClickListener(web);
        mBinding.qrcode.setOnClickListener(web);
        mBinding.bacode.setOnClickListener(web);
        mBinding.send.setOnClickListener(web);
        mBinding.list.setOnClickListener(web);
        mBinding.present.setOnClickListener(web);
        mBinding.shoppingmy.setOnClickListener(web);
        mBinding.reservemy.setOnClickListener(web);
        mBinding.recommand4.setOnClickListener(web);
        mBinding.recommand5.setOnClickListener(web);
        mBinding.recommand6.setOnClickListener(web);
        mBinding.growth.setOnClickListener(web);
        mBinding.growth1.setOnClickListener(web);
        mBinding.growth2.setOnClickListener(web);
        mBinding.growth3.setOnClickListener(web);
        mBinding.growth4.setOnClickListener(web);
        mBinding.growth5.setOnClickListener(web);
        mBinding.notice.setOnClickListener(web);
        mBinding.center.setOnClickListener(web);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.hold,R.anim.mypage2);

    }
    class MoviePagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();

        public MoviePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addItem(Fragment item) {
            items.add(item);
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }
    }
    View.OnClickListener web = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.mybutton:
                    gourl = "https://nid.naver.com/mobile/user/help/naverProfile.nhn?lang=ko";
                    break;
                case R.id.qrbutton:
                    gourl = "https://nid.naver.com/login/privacyQR";
                    break;
                case R.id.naverplus:
                    gourl = "https://nid.naver.com/membership/join";
                    break;
                case R.id.context:
                    gourl = "https://nid.naver.com/user2/campaign/showInfo.nhn?m=showBannerCampaign&t=";
                    break;
                case R.id.naverpay:
                    gourl = "https://new-m.naver.com";
                    break;
                case R.id.naverpayhome:
                    gourl = "https://new-m.naver.com";
                    break;
                case R.id.naverpaymoney:
                    gourl = "https://new-m.naver.com";
                    break;
                case R.id.bacode:
                    gourl = "https://m.pay.naver.com/offline/zp/v2/auth/naver-app?surl=naverapp%3A%2F%2Fclosewindow&naverapp=true";
                    break;
                case R.id.send:
                    gourl = "https://m.pay.naver.com/send/m/remit/remitAddressee2";
                    break;
                case R.id.list:
                    gourl = "https://new-m.pay.naver.com/historybenefit/paymenthistory";
                    break;
                case R.id.present:
                    gourl = "https://m.pay.naver.com/mygift/mobile/s";
                    break;
                case R.id.shoppingmy:
                    gourl = "https://m.shopping.naver.com/my/home";
                    break;
                case R.id.reservemy:
                    gourl = "https://m.booking.naver.com/booked/list";
                    break;
                case R.id.recommand4:
                    gourl = "https://play.google.com/store/apps/details?id=com.nhn.android.calendar";
                    break;
                case R.id.recommand5:
                    gourl = "https://play.google.com/store/apps/details?id=com.naver.vibe";
                    break;
                case R.id.recommand6:
                    gourl = "https://play.google.com/store/apps/details?id=com.nhn.land.android";
                    break;
                case R.id.growth:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml";
                    break;
                case R.id.growth1:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml?tab=influencer";
                    break;
                case R.id.growth2:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml?tab=onstore";
                    break;
                case R.id.growth3:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml?tab=offstore";
                    break;
                case R.id.growth4:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml?tab=enterprise";
                    break;
                case R.id.growth5:
                    gourl = "https://m.naver.com/fragment/noticeGrowUp.shtml?tab=business_marketing";
                    break;
                case R.id.notice:
                    gourl = "https://m.naver.com/notice/?caller=ANDROID&noticeNum=";
                    break;
                case R.id.center:
                    gourl = "https://m.help.naver.com/support/index.help";
                    break;

            }
            Intent intent = new Intent(getApplicationContext(), webview.class);
            intent.putExtra("url", gourl);
            startActivity(intent);
        }
    };
}