package com.vagus.human;

public class Human {
	private int num;
	private String sex;
	private int like;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public Human(int num, String sex, int like) {
		super();
		this.num = num;
		this.sex = sex;
		this.like = like;
	}
	
	

}
