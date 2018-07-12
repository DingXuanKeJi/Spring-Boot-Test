package com.wx.java.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ContantTest {

	@Value("${com.wx.random.int.one}")
	private Integer randomOne;

	public Integer getRandomOne() {
		return randomOne;
	}

	public void setRandomOne(Integer randomOne) {
		this.randomOne = randomOne;
	}
	
	
}
