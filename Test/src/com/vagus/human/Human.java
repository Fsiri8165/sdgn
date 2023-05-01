package com.vagus.human;

import java.util.ArrayList;

public class Human {
	private ArrayList<Integer> likeList; // [2, 33, 44]
	private int myF; 
	private boolean couple; 
	private int lovePick; 
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(ArrayList<Integer> likeList, int myF) {
		super();
		this.likeList = likeList;
		this.myF = myF;
		this.couple = false;
		this.lovePick = 0;
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

	public int getLovePick() {
		return lovePick;
	}

	public void setLovePick(int lovePick) {
		this.lovePick = lovePick;
	}
	
	
}
