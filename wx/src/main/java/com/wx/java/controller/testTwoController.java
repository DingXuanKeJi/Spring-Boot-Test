package com.wx.java.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wx.java.entity.ContantTest;

@Controller
@RequestMapping(value="/testTwo")
public class testTwoController {
	
	Log log = LogFactory.getLog(testTwoController.class);
	
	@Autowired
	private ContantTest contantTest;
	
	@RequestMapping("/test")
	@ResponseBody
	public void test() {
		log.info("我是随机数"+contantTest.getRandomOne());
	}
}
