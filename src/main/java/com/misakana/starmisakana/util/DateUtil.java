package com.misakana.starmisakana.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getString(Date date)
    {//2016-08-02 22:21:58

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    public static Date getDate(String datestr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=null;
        try {
            date= sdf.parse(datestr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

}
