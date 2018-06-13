package com.result;

import java.io.Serializable;

public class GCurrencyData implements Serializable{

	private static final long serialVersionUID = 1L;

	private String data_text_id = "2223";
	private String data_brief = "比特币是。。。。。。。";
	private String remark = "比特币btc";
	public String getData_text_id() {
		return data_text_id;
	}
	public void setData_text_id(String data_text_id) {
		this.data_text_id = data_text_id;
	}
	public String getData_brief() {
		return data_brief;
	}
	public void setData_brief(String data_brief) {
		this.data_brief = data_brief;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
