package com.wx.java.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class student implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
}
