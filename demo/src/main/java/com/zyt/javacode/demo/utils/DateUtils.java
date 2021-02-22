package com.zyt.javacode.demo.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    // Format definition
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    static SimpleDateFormat sdtf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    static SimpleDateFormat sdtfTran = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    static SimpleDateFormat sdtdashf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    // Today date 2020-10-10
    public static String getTodayDate() {
        Date today = new Date();
        return sdf.format(today.getTime());
    }

    //yesterday -1, tomorrow +1
    public static String getDateViaDayDiff(int dayDiff) {
        Date today = new Date();
        Date date = new Date(today.getTime() + dayDiff*24*60*60*1000L);
        return sdf.format(date.getTime());
    }

    public static String getYesterdayDate() {
        return getDateViaDayDiff(-1);
    }

    public static String getTomorrowDate() {
        return getDateViaDayDiff(1);
    }

    public static String getTodayDateTime() {
        Date today = new Date();
        return sdtf.format(today.getTime());
    }

    public static String getReportDateTime() {
        Date today = new Date();
        return sdtdashf.format(today.getTime());
    }

    public static String getTodayDateTimeTran() {
        Date today = new Date();
        return sdtfTran.format(today.getTime());
    }

    //yesterday -1, tomorrow +1
    public static String getDateTimeViaDayDiff(int dayDiff) {
        Date today = new Date();
        Date date = new Date(today.getTime() + dayDiff*24*60*60*1000L);
        return sdtf.format(date.getTime());
    }

    public static Timestamp getTimestampViaDayDiff(int dayDiff) {
        Date today = new Date();
        Timestamp ts = new Timestamp(today.getTime() + dayDiff*24*60*60*1000L);
        return ts;
    }

    public static Date strToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String removeMilli(String timeStr) {
        int length = timeStr.length();
        return timeStr.substring(0, length-4);
    }

    public static String removeSec(String timeStr) {
        int length = timeStr.length();
        return timeStr.substring(0, length-13);
    }

    public static void main(String[] args) {
        DateUtils dt = new DateUtils();
        System.out.println("today: " + dt.getDateViaDayDiff(0));
        System.out.println("yesterday: " + dt.getDateViaDayDiff(-1));
        System.out.println("tomorrow: " + dt.getDateViaDayDiff(1));
        System.out.println("datetime: " + getTodayDateTime());
        System.out.println("datetime: " + dt.removeMilli(getTodayDateTime()));
        System.out.println("45: " + dt.getDateViaDayDiff(-45));
        System.out.println(dt.getTodayDateTimeTran());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.nanoTime());
        System.out.println(getTimestampViaDayDiff(0));
        System.out.println(getTimestampViaDayDiff(1));
    }

}
