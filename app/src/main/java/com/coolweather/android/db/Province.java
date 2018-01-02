package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 吴雅诗 on 2018/1/2.
 */

public class Province extends DataSupport {
    private int id;
    private String provinseName;
    private int proviceCode;
    private int getId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinseName() {
        return provinseName;
    }

    public void setProvinseName(String provinseName) {
        this.provinseName = provinseName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }
}
