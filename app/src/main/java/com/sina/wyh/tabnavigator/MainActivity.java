package com.sina.wyh.tabnavigator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import com.sina.wyh.tabnavigator.adapter.ListPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListView listView2;
    private ListView listView3;
    private ListView listView4;
    private ListView listView5;
    private ListView listView6;
    private ListView listView7;
    private Button button;
    private Button button2;
    private Button button3;
    private ViewPager viewPager;
    private ListPagerAdapter listPagerAdapter;
    private String[] datainfor={"information1_data","information2_data","information3_data","information4_data","information5_data",
            "information6_data","information7_data","information8_data","information9_data","information10_data"};
    private String[] data={"Item1_data","Item2_data","Item3_data","Item4_data","Item5_data",
            "Item6_data","Item7_data","Item8_data","Item9_data","Item10_data"};
    private String[] data2={"data_Item1","data_Item2","data_Item3","data_Item4","data_Item5",
            "data_Item6","data_Item7","data_Item8","data_Item9","data_Item10"};
    private String[] data3={"data","data2","data3","data4","data5",
            "data6","data7","data8","data9","data10"};
    private String[] data4={"data10","data9","data8","data7","data6",
            "data5","data4","data3","data2","data1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();
        viewPager=findViewById(R.id.viewpager);
        TabHost tabHost=findViewById(R.id.tabhost);
        tabHost.setup();//初始化TabHost容器
        //在TabHost创建标签，然后设置：标题／图标／标签页布局
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(null,getResources().getDrawable(R.drawable.information)).setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(null,getResources().getDrawable(R.drawable.search)).setContent(R.id.tab2));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(null,getResources().getDrawable(R.drawable.address)).setContent(R.id.tab3));
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator(null,getResources().getDrawable(R.drawable.mine)).setContent(R.id.tab4));
        tabHost.getTabWidget().bringToFront();
        List<View> viewList = new ArrayList<>();
        LayoutInflater layoutInflater = getLayoutInflater();
        View view1 = layoutInflater.inflate(R.layout.list_pager1, null);
        View view2 = layoutInflater.inflate(R.layout.list_pager2, null);
        View view3 = layoutInflater.inflate(R.layout.list_pager3, null);
        listView5=view1.findViewById(R.id.list_item5);
        listView6=view2.findViewById(R.id.list_item6);
        listView7=view3.findViewById(R.id.list_item7);
        ArrayAdapter<String> adapter5=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,datainfor);
        listView5.setAdapter(adapter5);
        ArrayAdapter<String> adapter6=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        listView6.setAdapter(adapter6);
        ArrayAdapter<String> adapter7=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,datainfor);
        listView7.setAdapter(adapter7);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        listPagerAdapter=new ListPagerAdapter(viewList);
        viewPager.setAdapter(listPagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });//页面变化监听
        viewPager.setOffscreenPageLimit(2);//设置缓存页面数。当前页，左右两边（单边）最大缓存页面数。
        listPagerAdapter.notifyDataSetChanged();
    }
    public void initListView(){
//        listView=findViewById(R.id.list_item);
        listView2=findViewById(R.id.list_item2);
        listView3=findViewById(R.id.list_item3);
        listView4=findViewById(R.id.list_item4);
        button=findViewById(R.id.recommand);
        button2=findViewById(R.id.technology);
        button3=findViewById(R.id.economy);
        button.setBackgroundColor(Color.parseColor("#666666"));
        button2.setBackgroundColor(Color.parseColor("#FFFFFF"));
        button3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        listView.setAdapter(adapter);
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,data2);
        listView2.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,data3);
        listView3.setAdapter(adapter3);
        ArrayAdapter<String> adapter4=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,data4);
        listView4.setAdapter(adapter4);
    }
}