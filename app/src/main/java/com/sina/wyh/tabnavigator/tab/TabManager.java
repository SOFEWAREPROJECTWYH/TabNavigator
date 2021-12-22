package com.sina.wyh.tabnavigator.tab;

import android.widget.LinearLayout;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxu11
 * @since 2021/12/22
 */
public class TabManager {

    private final LinearLayout tabContainer;
    private final TabHost tabHost;

    private TabManager(LinearLayout tabContainer, TabHost tabHost) {
        this.tabContainer = tabContainer;
        this.tabHost = tabHost;
    }

    private List<String> tabList = new ArrayList<>();

    public static TabManager init(LinearLayout tabContainer, TabHost tabHost) {
        return new TabManager(tabContainer, tabHost);
    }

    /**
     * 根据tab数据生成对应的tab对象。
     */
    public void settle() {

    }

    private void makeTabData() {
        tabList.clear();
        for (int i = 0; i < 4; i++) {
            tabList.add("按钮" + i);
        }
    }
}
