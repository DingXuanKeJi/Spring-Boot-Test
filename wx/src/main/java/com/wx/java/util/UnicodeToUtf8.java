package com.wx.java.util;

import java.io.UnsupportedEncodingException;

/**
 * unicode转换utf-8
 */
public class UnicodeToUtf8 {

	public static String toChange(String str) {
		try {
			return new String(str.getBytes("UTF-8"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}
}
