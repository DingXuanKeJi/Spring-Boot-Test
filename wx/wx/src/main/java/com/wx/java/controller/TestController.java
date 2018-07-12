package com.wx.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wx.java.entity.UchomeDeviceKeySecret;
import com.wx.java.respository.UcTestRespository;

@Controller
@RequestMapping(value="/test")
public class TestController {

	@Autowired
	private UcTestRespository ucTestRespository;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public List<UchomeDeviceKeySecret> findAll(){
		return ucTestRespository.findAll();
	}
}
