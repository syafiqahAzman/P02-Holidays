package com.myapplicationdev.android.p02_holidays;

import androidx.annotation.NonNull;

public class Holiday {
    private String name;
    private String date;
    private int res;

    public Holiday(String name, String date, int res) {
        this.name = name;
        this.date = date;
        this.res = res;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

    public int getRes() {
        return res;
    }


}
