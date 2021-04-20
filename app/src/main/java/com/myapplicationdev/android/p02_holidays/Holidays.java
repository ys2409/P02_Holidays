package com.myapplicationdev.android.p02_holidays;

public class Holidays {
    private String holName;
    private String date;
    private boolean holIcon;
    public Holidays(String holName, String date, boolean holIcon) {
        this.holName = holName;
        this.holIcon = holIcon;
        this.date = date;
    }
    public String getHolName() {

        return holName;
    }
    public String getDate() {
        return date;
    }
    public boolean isHolIcon() {

        return holIcon;
    }
}
