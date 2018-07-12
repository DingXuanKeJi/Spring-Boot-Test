package com.wx.java.job;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 */
@Component
public class SchedulingMission {
	
	private static final String format = "yyyy-MM-dd hh:mm:ss";

//	/**
//	 * 2秒的
//	 */
//	@Scheduled(cron = "0/2 * * * * *")
//	public void test() {
//		System.out.println("我是定时器1,现在是"+LocalDateTime.now().format(DateTimeFormatter.ofPattern(format)));
//	}
//	
//	/**
//	 * 5秒的
//	 */
//	@Scheduled(fixedRate = 5000)
//	public void testtwo() {
//		System.out.println("我是定时器2，现在是"+LocalDateTime.now().format(DateTimeFormatter.ofPattern(format)));
//	}
}
