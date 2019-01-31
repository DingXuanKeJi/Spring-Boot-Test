package com.wx.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(value = "com.wx.java.respository")
@EnableScheduling
public class WxApplication {

	public static void main(String[] args) {
	    // SpringApplication SpringApplication = new SpringApplication(WxApplication.class);
	    // SpringApplication.setAddCommandLineProperties(false);
	    // SpringApplication.run(args);
		SpringApplication.run(WxApplication.class, args);
	}
}
