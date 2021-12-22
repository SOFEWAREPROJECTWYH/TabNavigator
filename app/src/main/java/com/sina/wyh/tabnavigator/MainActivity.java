package com.sina.wyh.tabnavigator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;

import com.sina.wyh.tabnavigator.tab.TabManager;

public class MainActivity extends AppCompatActivity {

    private View realContent;
    private LinearLayout tabContainer;
    private TabManager tabManager;
    private TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabhost = findViewById(android.R.id.tabhost);
        realContent = findViewById(R.id.realContent);
        tabContainer = findViewById(R.id.tabContainer);
        tabManager = TabManager.init(tabContainer, tabhost);
        tabhost.setup();
        tabManager.settle();
    }


}