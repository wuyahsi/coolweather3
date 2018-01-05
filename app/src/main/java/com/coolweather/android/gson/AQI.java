package com.coolweather.android.gson;

/**
 * Created by 吴雅诗 on 2018/1/3.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
