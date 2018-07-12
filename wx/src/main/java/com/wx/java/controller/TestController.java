package com.wx.java.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wx.java.entity.ContantTest;
import com.wx.java.entity.Student.SeasonEnum;
import com.wx.java.entity.UchomeDeviceKeySecret;
import com.wx.java.respository.UcTestRespository;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	Log log = LogFactory.getLog(TestController.class);

	@Autowired
	private UcTestRespository ucTestRespository;

	@Autowired
	private ContantTest contantTest;

	@RequestMapping(value = "/test")
	@ResponseBody
	public List<UchomeDeviceKeySecret> findAll() {
	    System.out.println(SeasonEnum.SUMMER.ordinal());
	    System.out.println(SeasonEnum.SUMMER.getSeq());
	    log.info("我是随机数" + contantTest.getRandomOne());
	    return ucTestRespository.findAll();
	}
	
	@RequestMapping("/toHome")
	public String toHome(Model model) {
	    model.addAttribute("host", "抱歉");
	    return "/home";
	}
}
