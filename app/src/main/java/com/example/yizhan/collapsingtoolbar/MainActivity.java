package com.example.yizhan.collapsingtoolbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("标题栏");

        ImageView ivBg = (ImageView) findViewById(R.id.iv_bg);
        Glide.with(this).load(R.drawable.pic).into(ivBg);

        TextView tvContent = (TextView) findViewById(R.id.tv_content);
        StringBuilder builder = new StringBuilder();
        for( int i = 0; i < 500; i++ ){
            builder.append("1234567890");
        }
        tvContent.setText(builder.toString());

    }
}
