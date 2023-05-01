package com.vagus.human;

import java.util.ArrayList;

public class Human {
	private ArrayList<Integer> likeList;
	private int myF;
	private boolean couple;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(ArrayList<Integer> likeList, int myF, boolean couple) {
		super();
		this.likeList = likeList;
		this.myF = myF;
		this.couple = couple;
	}
	
	public Human(int myF, boolean couple) {
		super();
		this.myF = myF;
		this.couple = couple;
	}

	public ArrayList<Integer> getLikeList() {
		return likeList;
	}

	public void setLikeList(ArrayList<Integer> likeList) {
		this.likeList = likeList;
	}

	public int getMyF() {
		return myF;
	}

	public void setMyF(int myF) {
		this.myF = myF;
	}

	public boolean isCouple() {
		return couple;
	}

	public void setCouple(boolean couple) {
		this.couple = couple;
	}
	
	
}
