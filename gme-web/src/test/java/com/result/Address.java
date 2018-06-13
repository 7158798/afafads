package com.result;

import java.io.Serializable;
import java.math.BigDecimal;

public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String address ="1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";
    private String remark ="测试";
    private String datetime ="2018-02-02 10:10:00";
    private String symbol="LTC";

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
