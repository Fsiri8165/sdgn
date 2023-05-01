package com.vagus.human;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

// 각 사람별 호감도 list를 채움
// 호감도 1순위 대상을 찾아감, 커플아닌 사람만
// 
public class ReadText {
	public static ArrayList<HashMap<Integer, Human>> readFile() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream("C:\\Users\\LENOVO\\Downloads\\tc3_answer1.txt"), "utf-8"));
			String line = null;
			String[] str = null;
			HashMap<Integer, Human> mans = new HashMap<>();
			HashMap<Integer, Human> womans = new HashMap<>();
			while ((line = br.readLine()) != null) {
				str = line.split(" ");
				if (str[0].equals("W")) break;
				if (!Character.isDigit(str[0].charAt(0))) continue; // 첫줄은 쓸모없
				mans.put(Integer.parseInt(str[0]), new Human(Integer.parseInt(str[1]), false));
			}
			
			womans.put(Integer.parseInt(str[0]), new Human(Integer.parseInt(str[1]), false)); // 한 번 해줘야함
			
			while ((line = br.readLine()) != null) {
				str = line.split(" ");
				if (!Character.isDigit(str[0].charAt(0))) continue;
				womans.put(Integer.parseInt(str[0]), new Human(Integer.parseInt(str[1]), false));
			}
			ArrayList<HashMap<Integer, Human>> ret = new ArrayList<>();
			ret.add(mans);
			ret.add(womans);
			return ret; // 바꿔야함
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
	}

	public static void main(String[] args) {
	}
}
