package com.wx.java;

import java.io.UnsupportedEncodingException;

public class test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		 	String s1 = "\u5e7f\u5c9b\u4e4b\u604b.mp3";
		    byte[] converttoBytes = s1.getBytes("UTF-8");
		    String s2 = new String(converttoBytes, "UTF-8");
		    System.out.println(s2);
	}

}
