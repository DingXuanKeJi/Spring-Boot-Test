package com.wx.java.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UchomeDeviceKeySecret implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String appKey;

	private String appSecret;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
