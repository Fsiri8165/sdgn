package com.vagus.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Sort {
	public static void main(String[] args) {
		sortHuman(ReadText.readFile());
	}
	
	// likeList 만들어서 정렬
	public static void sortHuman(ArrayList<HashMap<Integer, Human>> humans) {
		ArrayList<Integer> mans = new ArrayList<>();
		ArrayList<Integer> womans = new ArrayList<>();
		ArrayList<Integer> likeList = new ArrayList<>();
		for (Entry<Integer, Human> man : humans.get(0).entrySet()) {
			mans.add(man.getKey());
		}

		for (Entry<Integer, Human> woman : humans.get(1).entrySet()) {
			womans.add(woman.getKey());
		}

		for (Entry<Integer, Human> ms : humans.get(0).entrySet()) {
			int m = ms.getKey();
			Human h = ms.getValue();
			int f = h.getMyF();
			womans.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (f == 0) {
						if (Math.abs(o1 - m) > Math.abs(o2 - m)) {
							return -1;
						} else if (Math.abs(o1 - m) < Math.abs(o2 - m)) {
							return 1;
						} else {
							return o1.compareTo(o2);
						}
					} else {
						if (Math.abs(o1 - m) > Math.abs(o2 - m)) {
							return 1;
						} else if (Math.abs(o1 - m) < Math.abs(o2 - m)) {
							return -1;
						} else {
							return o1.compareTo(o2);
						}
					}
				}
			});
			System.out.println(m);
			System.out.println(womans);
			h.setLikeList((ArrayList<Integer>) womans.clone());
		}
		System.out.println("--------------------------------");
		for (Entry<Integer, Human> wms : humans.get(1).entrySet()) {
			int m = wms.getKey();
			Human h = wms.getValue();
			int f = h.getMyF();
			mans.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if (f == 0) {
						if (Math.abs(o1 - m) > Math.abs(o2 - m)) {
							return -1;
						} else if (Math.abs(o1 - m) < Math.abs(o2 - m)) {
							return 1;
						} else {
							return o1.compareTo(o2);
						}
					} else {
						if (Math.abs(o1 - m) > Math.abs(o2 - m)) {
							return 1;
						} else if (Math.abs(o1 - m) < Math.abs(o2 - m)) {
							return -1;
						} else {
							return o1.compareTo(o2);
						}
					}
				}
			});
			System.out.println(m);
			System.out.println(mans);
			h.setLikeList((ArrayList<Integer>) mans.clone());
		}
		
	}

}
