package com.coolweather.android.gson;

/**
 * Created by tarena on 2017/9/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
