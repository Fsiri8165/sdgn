package com.vagus.human;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Output {
	public static void main(String[] args) {
		ArrayList<HashMap<Integer, Human>> rf = ReadText.readFile();
		Sort.sortHuman(rf);
		printCount(rf);
	}

	public static void printCount(ArrayList<HashMap<Integer, Human>> a) {
		int count = 0;

		ArrayList<Integer> likeList = null;
		HashMap<Integer, Human> manhs = a.get(0);
		HashMap<Integer, Human> womanhs = a.get(1);
		int beforeCnt = -1;
		while (count != beforeCnt) {
			beforeCnt = count;
			for (Entry<Integer, Human> h : manhs.entrySet()) {
				int pn = h.getKey();
				Human man = h.getValue();
				likeList = man.getLikeList();
				if (man.isCouple()) {
					continue;
				}
				int lp = man.getLovePick();
				Human woman = null;
				while (true) {
					woman = womanhs.get(likeList.get(lp));
					if (woman.isCouple()) {
						lp++;
					} else {
						break;
					}

				}
				man.setLovePick(lp);

				// woman이 가장 선호하는 남성 찾기
				likeList = woman.getLikeList();
				int lp2 = woman.getLovePick();
				// 그 남성이 커플일 경우 lp를 하나씩 밀어가면서 couple이 아닌 가장 선호하는 남성 찾기
				while (true) {
					man = manhs.get(likeList.get(lp2));
					if (man.isCouple()) {
						lp2++;
					} else {
						break;
					}
				}
				woman.setLovePick(lp2);

				// man이 woman이 가장 좋아하는 남자와 동일인물이면 count 1 증가하고 남녀는 couple로 바꿔준다

				if (pn == likeList.get(lp2)) {
					count++;
					man.setCouple(true);
					woman.setCouple(true);
				} else {
					continue;
				}

			}
		}
		System.out.println(count);
	}

}
