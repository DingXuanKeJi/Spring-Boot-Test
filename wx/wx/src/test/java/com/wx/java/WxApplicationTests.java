package com.wx.java;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wx.java.entity.UchomeDeviceKeySecret;
import com.wx.java.respository.UcTestRespository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WxApplicationTests {

	@Autowired
	private UcTestRespository ucTestRespository;
	
	@Test
	public void contextLoads() {
		List<UchomeDeviceKeySecret> result = ucTestRespository.findAll();
		result.stream().forEach(System.out :: print);
		
	}

}
