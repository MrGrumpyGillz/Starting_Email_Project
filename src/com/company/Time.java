package com.company;

public class Time {
    private int day;
    private int week;
    private int hour;
    private int minute;
    private int month;
    Time(int month, int w, int d, int h, int min){
        day = d;
        week = w;
        hour = h;
        minute = min;
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
