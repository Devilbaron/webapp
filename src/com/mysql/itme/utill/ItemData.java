package com.mysql.itme.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Admin on 2017/8/16.
 */
public class ItemData {
    public ItemData(){

    }
    public static String data(){
        Date date = new Date();
        long times = date.getTime();//时间戳
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
        return dateString;
    }

}
