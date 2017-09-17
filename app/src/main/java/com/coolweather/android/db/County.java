package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by tarena on 2017/7/23.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;  // 记录县所对应的天气id
    private int cityId;  // 记录县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countName) {
        this.countyName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
