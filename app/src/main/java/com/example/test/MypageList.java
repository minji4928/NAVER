package com.example.test;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.test.databinding.FragmentMypageListBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MypageList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MypageList extends Fragment {

    ImageButton mail1, keep1, cafe1, blog1, shopping1, pay1, webtoon1, kin1;
    Button mail, keep, cafe, blog, shopping, pay, webtoon, kin;
    String gourl;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MypageList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MypageList.
     */
    // TODO: Rename and change types and number of parameters
    public static MypageList newInstance(String param1, String param2) {
        MypageList fragment = new MypageList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_mypage_list,container,false);
        mail1 = rootview.findViewById(R.id.mailbutton);
        keep1 = rootview.findViewById(R.id.keepbutton);
        cafe1 = rootview.findViewById(R.id.cafebutton);
        blog1 = rootview.findViewById(R.id.blogbutton);
        shopping1 = rootview.findViewById(R.id.shoppingbutton);
        pay1 = rootview.findViewById(R.id.paybutton);
        webtoon1 = rootview.findViewById(R.id.webtoonbutton);
        kin1 = rootview.findViewById(R.id.inbutton);

        mail = rootview.findViewById(R.id.mailbutton2);
        keep = rootview.findViewById(R.id.keepbutton2);
        cafe = rootview.findViewById(R.id.cafebutton2);
        blog = rootview.findViewById(R.id.blogbutton2);
        shopping = rootview.findViewById(R.id.shoppingbutton2);
        pay = rootview.findViewById(R.id.paybutton2);
        webtoon = rootview.findViewById(R.id.webtoonbutton2);
        kin = rootview.findViewById(R.id.inbutton2);


        mail1.setOnClickListener(fragmentclick);
        keep1.setOnClickListener(fragmentclick);
        cafe1.setOnClickListener(fragmentclick);
        blog1.setOnClickListener(fragmentclick);
        shopping1.setOnClickListener(fragmentclick);
        pay1.setOnClickListener(fragmentclick);
        webtoon1.setOnClickListener(fragmentclick);
        kin1.setOnClickListener(fragmentclick);
        mail.setOnClickListener(fragmentclick);
        keep.setOnClickListener(fragmentclick);
        cafe.setOnClickListener(fragmentclick);
        blog.setOnClickListener(fragmentclick);
        shopping.setOnClickListener(fragmentclick);
        pay.setOnClickListener(fragmentclick);
        webtoon.setOnClickListener(fragmentclick);
        kin.setOnClickListener(fragmentclick);

        return rootview;
    }

    View.OnClickListener fragmentclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.mailbutton:
                    gourl = "https://m.mail.naver.com";
                    break;
                case R.id.mailbutton2:
                    gourl = "https://m.mail.naver.com";
                    break;
                case R.id.keepbutton:
                    gourl = "https://m.keep.naver.com";
                    break;
                case R.id.keepbutton2:
                    gourl = "https://m.keep.naver.com";
                    break;
                case R.id.cafebutton:
                    gourl = "https://m.cafe.naver.com/ca-fe";
                    break;
                case R.id.cafebutton2:
                    gourl = "https://m.cafe.naver.com/ca-fe";
                    break;
                case R.id.blogbutton:
                    gourl = "https://m.blog.naver.com/FeedList.nhn";
                    break;
                case R.id.blogbutton2:
                    gourl = "https://m.blog.naver.com/FeedList.nhn";
                    break;
                case R.id.shoppingbutton:
                    gourl = "https://m.shopping.naver.com/home/m/index.nhn";
                    break;
                case R.id.shoppingbutton2:
                    gourl = "https://m.shopping.naver.com/home/m/index.nhn";
                    break;
                case R.id.paybutton:
                    gourl = "https://new-m.pay.naver.com";
                    break;
                case R.id.paybutton2:
                    gourl = "https://new-m.pay.naver.com";
                    break;
                case R.id.webtoonbutton:
                    gourl = "https://m.comic.naver.com/index.nhn";
                    break;
                case R.id.webtoonbutton2:
                    gourl = "https://m.comic.naver.com/index.nhn";
                    break;
                case R.id.inbutton:
                    gourl = "https://m.kin.naver.com/mobile/index.nhn";
                    break;
                case R.id.inbutton2:
                    gourl = "https://m.kin.naver.com/mobile/index.nhn";
                    break;
            }
            Intent intent = new Intent(getActivity(), webview.class);
            intent.putExtra("url", gourl);
            startActivity(intent);
        }
    };

}