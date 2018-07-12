package com.wx.java.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private Integer season;
	
	public enum SeasonEnum {
		SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

		private int seq;

		SeasonEnum(int seq) {
			this.setSeq(seq);
		}

		public int getSeq() {
			return seq;
		}

		public void setSeq(int seq) {
			this.seq = seq;
		}
		
	}
}
